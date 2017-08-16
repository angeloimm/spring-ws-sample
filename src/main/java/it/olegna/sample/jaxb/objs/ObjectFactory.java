//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.08.16 alle 08:24:14 AM CEST 
//


package it.olegna.sample.jaxb.objs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.olegna.sample.jaxb.objs package. 
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

    private final static QName _RequestImplementation_QNAME = new QName("http://www.example.org/SpringSample/", "requestImplementation");
    private final static QName _ResponseImplementation_QNAME = new QName("http://www.example.org/SpringSample/", "responseImplementation");
    private final static QName _RequestImplementation2_QNAME = new QName("http://www.example.org/SpringSample/", "requestImplementation2");
    private final static QName _ResponseImplementation2_QNAME = new QName("http://www.example.org/SpringSample/", "responseImplementation2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.olegna.sample.jaxb.objs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AbstractRequest }
     * 
     */
    public AbstractRequest createAbstractRequest() {
        return new AbstractRequest();
    }

    /**
     * Create an instance of {@link AbstractResponse }
     * 
     */
    public AbstractResponse createAbstractResponse() {
        return new AbstractResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/SpringSample/", name = "requestImplementation")
    public JAXBElement<AbstractRequest> createRequestImplementation(AbstractRequest value) {
        return new JAXBElement<AbstractRequest>(_RequestImplementation_QNAME, AbstractRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/SpringSample/", name = "responseImplementation")
    public JAXBElement<AbstractResponse> createResponseImplementation(AbstractResponse value) {
        return new JAXBElement<AbstractResponse>(_ResponseImplementation_QNAME, AbstractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/SpringSample/", name = "requestImplementation2")
    public JAXBElement<AbstractRequest> createRequestImplementation2(AbstractRequest value) {
        return new JAXBElement<AbstractRequest>(_RequestImplementation2_QNAME, AbstractRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/SpringSample/", name = "responseImplementation2")
    public JAXBElement<AbstractResponse> createResponseImplementation2(AbstractResponse value) {
        return new JAXBElement<AbstractResponse>(_ResponseImplementation2_QNAME, AbstractResponse.class, null, value);
    }

}
