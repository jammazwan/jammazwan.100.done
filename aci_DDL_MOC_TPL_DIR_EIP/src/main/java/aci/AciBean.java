package aci;

import org.apache.camel.RoutingSlip;

public class AciBean {


    @RoutingSlip
    public String slip(String body) {
        String answer = "direct:three";
        if (body.contains("boy")) {
            answer += ",direct:boy";
        }
        answer += ",direct:four";
        return answer;
    }
}
