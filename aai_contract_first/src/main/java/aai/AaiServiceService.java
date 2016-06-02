package aai;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.6
 * 2016-05-09T08:42:25.984-05:00
 * Generated source version: 3.0.6
 * 
 */
@WebServiceClient(name = "AaiServiceService", 
                  wsdlLocation = "file:/Users/petecarapetyan/work/jammazwan/aai_contract_first/src/main/resources/wsdl/aai.wsdl",
                  targetNamespace = "http://aai/") 
public class AaiServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://aai/", "AaiServiceService");
    public final static QName AaiServicePort = new QName("http://aai/", "AaiServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/petecarapetyan/work/jammazwan/aai_contract_first/src/main/resources/wsdl/aai.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AaiServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/petecarapetyan/work/jammazwan/aai_contract_first/src/main/resources/wsdl/aai.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AaiServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AaiServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AaiServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AaiServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AaiServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AaiServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns AaiService
     */
    @WebEndpoint(name = "AaiServicePort")
    public AaiService getAaiServicePort() {
        return super.getPort(AaiServicePort, AaiService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AaiService
     */
    @WebEndpoint(name = "AaiServicePort")
    public AaiService getAaiServicePort(WebServiceFeature... features) {
        return super.getPort(AaiServicePort, AaiService.class, features);
    }

}
