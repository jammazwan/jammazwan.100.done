package aaz;

import java.util.Date;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

import aaz.domain.Trans;

public class AazRoutes extends RouteBuilder {

	@Override
    public void configure() throws Exception {
		from("file://../_csv/?noop=true&fileName=trans.csv").unmarshal("bindyDataformat")
        .process(new Processor() {
            public void process(Exchange exchange) throws Exception {
            	StringBuffer sb = new StringBuffer();
                List<Trans> list =(List<Trans>) exchange.getIn().getBody(); 
                for(Trans trans:list){
                	sb.append(trans.toString());
                }
                exchange.getIn().setBody(sb.toString());
                exchange.getIn().setHeader("CamelFileName", "aazImporant"+(new Date().getTime())+".txt");;
            }
        }).to("direct:two");
		
        from("direct:two").to("ftp://192.168.99.100/?username=petec&password=frog");;
    }
}
