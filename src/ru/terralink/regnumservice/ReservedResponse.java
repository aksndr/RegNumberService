
package ru.terralink.regnumservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservedResult" type="{http://schemas.datacontract.org/2004/07/SAPDM.X5.Web.RegNumbers}ArrayOfRegNumberRest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reservedResult"
})
@XmlRootElement(name = "ReservedResponse")
public class ReservedResponse {

    @XmlElementRef(name = "ReservedResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRegNumberRest> reservedResult;

    /**
     * Gets the value of the reservedResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRegNumberRest }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRegNumberRest> getReservedResult() {
        return reservedResult;
    }

    /**
     * Sets the value of the reservedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRegNumberRest }{@code >}
     *     
     */
    public void setReservedResult(JAXBElement<ArrayOfRegNumberRest> value) {
        this.reservedResult = value;
    }

}
