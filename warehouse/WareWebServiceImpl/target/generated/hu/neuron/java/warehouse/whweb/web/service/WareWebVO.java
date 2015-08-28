
package hu.neuron.java.warehouse.whweb.web.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wareWebVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wareWebVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="wareName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wareWebVO", propOrder = {
    "itemNumber",
    "wareName"
})
public class WareWebVO {

    protected int itemNumber;
    protected String wareName;

    /**
     * Gets the value of the itemNumber property.
     * 
     */
    public int getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     */
    public void setItemNumber(int value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the wareName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWareName() {
        return wareName;
    }

    /**
     * Sets the value of the wareName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWareName(String value) {
        this.wareName = value;
    }

}
