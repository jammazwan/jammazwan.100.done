"Jammazwan" [is Hindi](href="https://books.google.com/books?id=_kWROaer5UsC&amp;pg=PA1138&amp;lpg=PA1138&amp;dq=jammazwan+camel+keeper+hindi&amp;source=bl&amp;ots=7FaF5BXK_F&amp;sig=Cg-U5ORP3dHrFycaCFvo34GdpZ0&amp;hl=en&amp;sa=X&amp;ved=0ahUKEwj8v4OV3YbNAhVjpIMKHSYUB_oQ6AEIHDAA#v=onepage&amp;q=jammazwan%20camel%20keeper%20hindi&amp;f=false) for "camel keeper".

|Pete, author of Jammazwan|Another Camel Keeper|
| --- | --- |
|<img class="style-svg" src="https://betterologist.net/wp-content/uploads/2016/05/pete-300x297.jpg" alt="pete" width="116" height="115" />|<img class="style-svg" src="https://betterologist.net/wp-content/uploads/2016/05/jammazwanPhotoSmall.png" alt="jammazwanPhotoSmall" width="200" height="116" />|

# jammazwan.docker

This is a simple project to demonstrate how you can use docker to set up supporting infrastructure for your camel learning projects, without spending hours doing machine admin.

It assumes you already have your machine set up to run docker. **If that isn't the case, then _you_ have a whole _different_ set of problems!** Because docker is inevitable. Resistance is futile. You will eventually cave, FYI. Fortunately it is getting easier, as the months go by.

### Our mission: MySQL, ActiveMQ, FTP servers:

Let's say you want to do some sample projects to learn Camel, such as [jammazwan.100](https://github.com/jammazwan/jammazwan.100). But you **don't** want your box all cluttered up with junk that you might not otherwise use.

Go to your docker prompt, and paste in these commands.

```bash
docker pull mysql
docker run -p 3306:3306 --name e-mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -e MYSQL_DATABASE=squid -d mysql
```
Now you've got a mysql server up and running. Go ahead, try it. It's that simple.

On to activemq for JMS:

```bash
docker pull ivankrizsan/activemq-docker
docker run -p 8161:8161 -p 61616:61616 --name b-activemq -e CONTAINER_TIMEZONE=America/Chicago -d ivankrizsan/activemq-docker
```

Now you also have an activeMQ server running. [Hit this](http://192.168.99.100:8161/admin/) to test it in the browser. 

FTP server?

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

### Dumb docker commands you might find useful:

```bash
docker ps
docker images
```

Actually, I found that I did very little inside the docker shell for these three servers. Just made sure they were up and running...

### But Wait! There's a better way.

This demo is a cool demo, and it's dumb as a box of rocks. But you can also use fabric8. That is more powerful, just not as simple. 

### How to connect up to these servers with your Camel projects?

There may be other config necessary such as in your maven pom, but here are some snippets you might need.

```java
.to("ftp://192.168.99.100/?username=fred&password=frog");
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
<!-- some of this I am not so sure about, but this worked for me so I quit messing with it -->
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

And some of the substantial database config - this is the persistence.xml I used

```xml
<?xml version="1.0" encoding="UTF-8"?>
<persistence xmlns="http://java.sun.com/xml/ns/persistence" 
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" version="1.0">
  <persistence-unit name="camel" transaction-type="RESOURCE_LOCAL">
    <class>myorg.PurchaseOrder</class>
    <class>myorg.Ledger</class>
    <class>myorg.ProductionRun</class>
    <properties>
      <property name="openjpa.ConnectionDriverName" value="com.mysql.jdbc.Driver" />
      <property name="openjpa.ConnectionURL" value="jdbc:mysql://192.168.99.100:3306/squid" />
      <property name="openjpa.ConnectionUserName" value="root" />
      <property name="openjpa.ConnectionPassword" value="my-secret-pw" />
      <property name="openjpa.jdbc.SynchronizeMappings" value="buildSchema" />
    </properties>
  </persistence-unit>
</persistence>
```
### A tip for saving the above setup:

The bad news is that when you set up your servers, they go away as soon as you close the shells that kicked them off. **So you have to run the above sequence every time.**

Most of us run mac or windows for our dev enviroments, so we need to use headless VirtualBox vm (installed by docker installer) to run our docker vms. This is transparent, but we can use this to our advantage....

Once you set up your servers, instead of closing them by killing your docker shell, do this **to save your docker running servers exactly as you set them up!**

 * Open up your VirtualBox client UI
 * Find your running docker VM
 * Right click, Close > Save.

Now you can restart this VM from VirtualBox UI **before** starting up docker client next time, and your servers will be as you left them.

The instructions on setting up servers above run pretty quickly, so maybe you don't care. But if you do, here's an easy solution.

### Other?

You'll probably want to install php-myadmin or any of dozens of other clients, to look at your db, create schema, stuff like that. I found a docker image for that, but I already had php-myadmin running locally.

### Options?

These are just the docker images I found a few months ago. They work, but you might find better images instead.

#### Happy Trails!
