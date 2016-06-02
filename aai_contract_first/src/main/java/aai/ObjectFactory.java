
package aai;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aai package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Fixes_QNAME = new QName("http://aai/", "fixes");
    private final static QName _FixesResponse_QNAME = new QName("http://aai/", "fixesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aai
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Fixes }
     * 
     */
    public Fixes createFixes() {
        return new Fixes();
    }

    /**
     * Create an instance of {@link FixesResponse }
     * 
     */
    public FixesResponse createFixesResponse() {
        return new FixesResponse();
    }

    /**
     * Create an instance of {@link Car }
     * 
     */
    public Car createCar() {
        return new Car();
    }

    /**
     * Create an instance of {@link Mechanic }
     * 
     */
    public Mechanic createMechanic() {
        return new Mechanic();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fixes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aai/", name = "fixes")
    public JAXBElement<Fixes> createFixes(Fixes value) {
        return new JAXBElement<Fixes>(_Fixes_QNAME, Fixes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aai/", name = "fixesResponse")
    public JAXBElement<FixesResponse> createFixesResponse(FixesResponse value) {
        return new JAXBElement<FixesResponse>(_FixesResponse_QNAME, FixesResponse.class, null, value);
    }

}
