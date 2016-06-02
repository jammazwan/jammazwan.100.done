package acy;

import org.apache.camel.RoutingSlip;

public class AcyRoutingBean {

    @RoutingSlip
    public String slip() {
        String answer = "jms:notmuchhere";
        return answer;
    }

}
