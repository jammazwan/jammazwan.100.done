# jammazwan.docker

This is a simple project to demonstrate how you can use docker to set up supporting infrastructure for your camel learning projects, without spending hours doing machine admin.

It assumes you already have your machine set up to run docker, but if that isn't the case you have a whole different set of problems. Docker is inevitable. Resistance is futile.

### Our mission: Mysql server, ActiveMQ server, FTP server

Let's say you want to do some sample projects to learn Camel, such as [jammazwan.100](https://github.com/jammazwan/jammazwan.100). But you don't want your box all cluttered up with junk that you might not otherwise use.

Go to your docker prompt, and paste in these commands.

```bash
docker pull mysql
docker run -p 3306:3306 --name e-mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -e MYSQL_DATABASE=squid -d mysql
```
Now you've got a mysql server up and running. Go ahead, try it. It' that simple. 


```bash
docker pull ivankrizsan/activemq-docker
docker run -p 8161:8161 -p 61616:61616 --name b-activemq -e CONTAINER_TIMEZONE=America/Chicago -d ivankrizsan/activemq-docker
```

Now you also have an activeMQ server running. [Hit this](http://192.168.99.100:8161/admin/) to test it in the browser. 

```bash    
docker pull stilliard/pure-ftpd
docker run -p 21:21 --name ftpd_server -d stilliard/pure-ftpd
```

Your FTP server is now running, but it won't do you any good because nobody has permissions to hit it.

So what you have to do is first ssh inside the container, like so:

```bash
docker exec -it ftpd_server /bin/bash
```

Then from inside the FTP server shell, these bash commands, except the Fred part, of course.

```bash
pure-pw useradd myusername -u ftpuser -d /home/ftpusers/fred (enter [myuserpassword] twice for pw)
pure-pw mkdb
exit
```

Your FTP server should now be working. 

##### Testing FTP server on your macbook, like me? 

Don't try ftp commands from your mac bash shell. Or at least that's what I learned. It's a known mac bug. But it works great from my camel projects!

### But Wait! There's a better way.

This demo is a cool demo, and it's dumb as a box of rocks. But you can also use fabric8. That is more powerful, just not as simple. 

### How to connect up with your mac projects?

There may be other config necessary such as in your maven pom, but here are some snippets you might need.

```java
.to("ftp://192.168.99.100/?username=petec&password=frog");
```

and jms configuration:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:broker="http://activemq.apache.org/schema/core"
       xsi:schemaLocation="
         http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd
         http://activemq.apache.org/schema/core http://activemq.apache.org/schema/core/activemq-core.xsd">
  <broker:broker useJmx="false" persistent="false" brokerName="localhost">
    <broker:transportConnectors>
      <broker:transportConnector name="tcp" uri="tcp://localhost:61616" />
    </broker:transportConnectors>
  </broker:broker>
  <bean id="jms" class="org.apache.activemq.camel.component.ActiveMQComponent">
    <property name="brokerURL" value="tcp://192.168.99.100:61616" />
    <!--see http://activemq.apache.org/objectmessage.html-->
    <property name="trustAllPackages" value="true"/>
  </bean>
</beans>
```

```xml
<!-- some of this I am not so sure about -->
        <dependency>
            <groupId>org.apache.activemq</groupId>
            <artifactId>activemq-client</artifactId>
            <version>${activemq-version}</version>
        </dependency>
        <dependency>
            <groupId>org.apache.activemq</groupId>
            <artifactId>activemq-camel</artifactId>
            <version>${activemq-version}</version>
        </dependency>
        <dependency>
            <groupId>org.apache.activemq</groupId>
            <artifactId>activemq-pool</artifactId>
            <version>${activemq-version}</version>
        </dependency>
        <dependency>
            <groupId>org.apache.activemq</groupId>
            <artifactId>activemq-broker</artifactId>
            <version>${activemq-version}</version>
        </dependency>
        <dependency>
            <groupId>org.apache.activemq</groupId>
            <artifactId>activemq-spring</artifactId>
            <version>${activemq-version}</version>
        </dependency>
        <dependency>
            <groupId>org.apache.activemq</groupId>
            <artifactId>activemq-kahadb-store</artifactId>
            <version>${activemq-version}</version>
        </dependency>
```


### Other?

You'll probably want to install php-myadmin or any of dozens of other clients, to look at your db, create schema, stuff like that. I found a docker image for that, but I already had php-myadmin running locally.

#### Happy Trails!
