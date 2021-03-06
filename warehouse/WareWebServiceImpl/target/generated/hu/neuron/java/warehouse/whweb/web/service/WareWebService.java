
package hu.neuron.java.warehouse.whweb.web.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "WareWebService", targetNamespace = "http://service.web.whWeb.warehouse.java.neuron.hu/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WareWebService {


    /**
     * 
     * @return
     *     returns java.util.List<hu.neuron.java.warehouse.whweb.web.service.WareWebVO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllWares", targetNamespace = "http://service.web.whWeb.warehouse.java.neuron.hu/", className = "hu.neuron.java.warehouse.whweb.web.service.GetAllWares")
    @ResponseWrapper(localName = "getAllWaresResponse", targetNamespace = "http://service.web.whWeb.warehouse.java.neuron.hu/", className = "hu.neuron.java.warehouse.whweb.web.service.GetAllWaresResponse")
    public List<WareWebVO> getAllWares();

    /**
     * 
     * @param arg0
     * @return
     *     returns hu.neuron.java.warehouse.whweb.web.service.GetWaresNumbersResponse.Return
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWaresNumbers", targetNamespace = "http://service.web.whWeb.warehouse.java.neuron.hu/", className = "hu.neuron.java.warehouse.whweb.web.service.GetWaresNumbers")
    @ResponseWrapper(localName = "getWaresNumbersResponse", targetNamespace = "http://service.web.whWeb.warehouse.java.neuron.hu/", className = "hu.neuron.java.warehouse.whweb.web.service.GetWaresNumbersResponse")
    public hu.neuron.java.warehouse.whweb.web.service.GetWaresNumbersResponse.Return getWaresNumbers(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNumberOfWares", targetNamespace = "http://service.web.whWeb.warehouse.java.neuron.hu/", className = "hu.neuron.java.warehouse.whweb.web.service.GetNumberOfWares")
    @ResponseWrapper(localName = "getNumberOfWaresResponse", targetNamespace = "http://service.web.whWeb.warehouse.java.neuron.hu/", className = "hu.neuron.java.warehouse.whweb.web.service.GetNumberOfWaresResponse")
    public int getNumberOfWares(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "decreaseNumberOfWares", targetNamespace = "http://service.web.whWeb.warehouse.java.neuron.hu/", className = "hu.neuron.java.warehouse.whweb.web.service.DecreaseNumberOfWares")
    @ResponseWrapper(localName = "decreaseNumberOfWaresResponse", targetNamespace = "http://service.web.whWeb.warehouse.java.neuron.hu/", className = "hu.neuron.java.warehouse.whweb.web.service.DecreaseNumberOfWaresResponse")
    public void decreaseNumberOfWares(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

}
