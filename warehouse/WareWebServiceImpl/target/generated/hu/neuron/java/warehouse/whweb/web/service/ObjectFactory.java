
package hu.neuron.java.warehouse.whweb.web.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hu.neuron.java.warehouse.whweb.web.service package. 
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

    private final static QName _GetAllWares_QNAME = new QName("http://service.web.whWeb.warehouse.java.neuron.hu/", "getAllWares");
    private final static QName _GetNumberOfWares_QNAME = new QName("http://service.web.whWeb.warehouse.java.neuron.hu/", "getNumberOfWares");
    private final static QName _DecreaseNumberOfWaresResponse_QNAME = new QName("http://service.web.whWeb.warehouse.java.neuron.hu/", "decreaseNumberOfWaresResponse");
    private final static QName _GetWaresNumbersResponse_QNAME = new QName("http://service.web.whWeb.warehouse.java.neuron.hu/", "getWaresNumbersResponse");
    private final static QName _GetNumberOfWaresResponse_QNAME = new QName("http://service.web.whWeb.warehouse.java.neuron.hu/", "getNumberOfWaresResponse");
    private final static QName _DecreaseNumberOfWares_QNAME = new QName("http://service.web.whWeb.warehouse.java.neuron.hu/", "decreaseNumberOfWares");
    private final static QName _GetWaresNumbers_QNAME = new QName("http://service.web.whWeb.warehouse.java.neuron.hu/", "getWaresNumbers");
    private final static QName _GetAllWaresResponse_QNAME = new QName("http://service.web.whWeb.warehouse.java.neuron.hu/", "getAllWaresResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hu.neuron.java.warehouse.whweb.web.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWaresNumbersResponse }
     * 
     */
    public GetWaresNumbersResponse createGetWaresNumbersResponse() {
        return new GetWaresNumbersResponse();
    }

    /**
     * Create an instance of {@link GetNumberOfWaresResponse }
     * 
     */
    public GetNumberOfWaresResponse createGetNumberOfWaresResponse() {
        return new GetNumberOfWaresResponse();
    }

    /**
     * Create an instance of {@link GetWaresNumbersResponse.Return }
     * 
     */
    public GetWaresNumbersResponse.Return createGetWaresNumbersResponseReturn() {
        return new GetWaresNumbersResponse.Return();
    }

    /**
     * Create an instance of {@link GetAllWares }
     * 
     */
    public GetAllWares createGetAllWares() {
        return new GetAllWares();
    }

    /**
     * Create an instance of {@link GetWaresNumbersResponse.Return.Entry }
     * 
     */
    public GetWaresNumbersResponse.Return.Entry createGetWaresNumbersResponseReturnEntry() {
        return new GetWaresNumbersResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link DecreaseNumberOfWares }
     * 
     */
    public DecreaseNumberOfWares createDecreaseNumberOfWares() {
        return new DecreaseNumberOfWares();
    }

    /**
     * Create an instance of {@link GetNumberOfWares }
     * 
     */
    public GetNumberOfWares createGetNumberOfWares() {
        return new GetNumberOfWares();
    }

    /**
     * Create an instance of {@link DecreaseNumberOfWaresResponse }
     * 
     */
    public DecreaseNumberOfWaresResponse createDecreaseNumberOfWaresResponse() {
        return new DecreaseNumberOfWaresResponse();
    }

    /**
     * Create an instance of {@link WareWebVO }
     * 
     */
    public WareWebVO createWareWebVO() {
        return new WareWebVO();
    }

    /**
     * Create an instance of {@link GetWaresNumbers }
     * 
     */
    public GetWaresNumbers createGetWaresNumbers() {
        return new GetWaresNumbers();
    }

    /**
     * Create an instance of {@link GetAllWaresResponse }
     * 
     */
    public GetAllWaresResponse createGetAllWaresResponse() {
        return new GetAllWaresResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllWares }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.whWeb.warehouse.java.neuron.hu/", name = "getAllWares")
    public JAXBElement<GetAllWares> createGetAllWares(GetAllWares value) {
        return new JAXBElement<GetAllWares>(_GetAllWares_QNAME, GetAllWares.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumberOfWares }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.whWeb.warehouse.java.neuron.hu/", name = "getNumberOfWares")
    public JAXBElement<GetNumberOfWares> createGetNumberOfWares(GetNumberOfWares value) {
        return new JAXBElement<GetNumberOfWares>(_GetNumberOfWares_QNAME, GetNumberOfWares.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecreaseNumberOfWaresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.whWeb.warehouse.java.neuron.hu/", name = "decreaseNumberOfWaresResponse")
    public JAXBElement<DecreaseNumberOfWaresResponse> createDecreaseNumberOfWaresResponse(DecreaseNumberOfWaresResponse value) {
        return new JAXBElement<DecreaseNumberOfWaresResponse>(_DecreaseNumberOfWaresResponse_QNAME, DecreaseNumberOfWaresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWaresNumbersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.whWeb.warehouse.java.neuron.hu/", name = "getWaresNumbersResponse")
    public JAXBElement<GetWaresNumbersResponse> createGetWaresNumbersResponse(GetWaresNumbersResponse value) {
        return new JAXBElement<GetWaresNumbersResponse>(_GetWaresNumbersResponse_QNAME, GetWaresNumbersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumberOfWaresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.whWeb.warehouse.java.neuron.hu/", name = "getNumberOfWaresResponse")
    public JAXBElement<GetNumberOfWaresResponse> createGetNumberOfWaresResponse(GetNumberOfWaresResponse value) {
        return new JAXBElement<GetNumberOfWaresResponse>(_GetNumberOfWaresResponse_QNAME, GetNumberOfWaresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecreaseNumberOfWares }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.whWeb.warehouse.java.neuron.hu/", name = "decreaseNumberOfWares")
    public JAXBElement<DecreaseNumberOfWares> createDecreaseNumberOfWares(DecreaseNumberOfWares value) {
        return new JAXBElement<DecreaseNumberOfWares>(_DecreaseNumberOfWares_QNAME, DecreaseNumberOfWares.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWaresNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.whWeb.warehouse.java.neuron.hu/", name = "getWaresNumbers")
    public JAXBElement<GetWaresNumbers> createGetWaresNumbers(GetWaresNumbers value) {
        return new JAXBElement<GetWaresNumbers>(_GetWaresNumbers_QNAME, GetWaresNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllWaresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.whWeb.warehouse.java.neuron.hu/", name = "getAllWaresResponse")
    public JAXBElement<GetAllWaresResponse> createGetAllWaresResponse(GetAllWaresResponse value) {
        return new JAXBElement<GetAllWaresResponse>(_GetAllWaresResponse_QNAME, GetAllWaresResponse.class, null, value);
    }

}
