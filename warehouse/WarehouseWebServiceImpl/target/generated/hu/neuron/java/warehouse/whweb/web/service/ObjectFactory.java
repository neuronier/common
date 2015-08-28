
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

    private final static QName _GetAllWarehouseResponse_QNAME = new QName("http://service.web.whWeb.warehouse.java.neuron.hu/", "getAllWarehouseResponse");
    private final static QName _GetAllWarehouse_QNAME = new QName("http://service.web.whWeb.warehouse.java.neuron.hu/", "getAllWarehouse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hu.neuron.java.warehouse.whweb.web.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllWarehouseResponse }
     * 
     */
    public GetAllWarehouseResponse createGetAllWarehouseResponse() {
        return new GetAllWarehouseResponse();
    }

    /**
     * Create an instance of {@link WarehouseWebVO }
     * 
     */
    public WarehouseWebVO createWarehouseWebVO() {
        return new WarehouseWebVO();
    }

    /**
     * Create an instance of {@link GetAllWarehouse }
     * 
     */
    public GetAllWarehouse createGetAllWarehouse() {
        return new GetAllWarehouse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllWarehouseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.whWeb.warehouse.java.neuron.hu/", name = "getAllWarehouseResponse")
    public JAXBElement<GetAllWarehouseResponse> createGetAllWarehouseResponse(GetAllWarehouseResponse value) {
        return new JAXBElement<GetAllWarehouseResponse>(_GetAllWarehouseResponse_QNAME, GetAllWarehouseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllWarehouse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.whWeb.warehouse.java.neuron.hu/", name = "getAllWarehouse")
    public JAXBElement<GetAllWarehouse> createGetAllWarehouse(GetAllWarehouse value) {
        return new JAXBElement<GetAllWarehouse>(_GetAllWarehouse_QNAME, GetAllWarehouse.class, null, value);
    }

}
