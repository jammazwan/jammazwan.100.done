package aca;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AcaRoutes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	from("direct:one").to("direct:two");
    	
        from("direct:two")
            .dynamicRouter(method(DynamicRouterBean.class, "route"));

        from("direct://every").log("EVERY");
        from("direct://good").log("GOOD");
        from("direct://boy").log("BOY");
        from("direct://does").log("DOES");
        from("direct://fine").log("FINE");
    }
}
