package adh;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AdhRoutes extends RouteBuilder {


    @Override
    public void configure() throws Exception {
        from("file://../_xml/?noop=true&fileName=menu.xml")
            .process("adhProcessor").to("direct:two");
        from("direct:two").recipientList(header("recipients"));
		from("direct:beekeeper").log("EXPECTED RECIPIENT CONFIRMED");
    }
}
