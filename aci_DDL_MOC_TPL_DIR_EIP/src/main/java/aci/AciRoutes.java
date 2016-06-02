package aci;

import org.apache.camel.builder.RouteBuilder;

public class AciRoutes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:one").process("aciProcessor").to("direct:two");
        from("direct:two").bean("aciBean");
        from("direct:three").log("THREE");
        from("direct:boy").log("BOY");
        from("direct:four").log("FOUR");
    }
}
