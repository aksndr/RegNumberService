
package ru.terralink.regnumservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


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
 *         &lt;element name="NextResult" type="{http://schemas.datacontract.org/2004/07/NNxRegNumberService}RegNumber" minOccurs="0"/>
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
    "nextResult"
})
@XmlRootElement(name = "NextResponse")
public class NextResponse {

    @XmlElementRef(name = "NextResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegNumber> nextResult;

    /**
     * Gets the value of the nextResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegNumber }{@code >}
     *     
     */
    public JAXBElement<RegNumber> getNextResult() {
        return nextResult;
    }

    /**
     * Sets the value of the nextResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegNumber }{@code >}
     *     
     */
    public void setNextResult(JAXBElement<RegNumber> value) {
        this.nextResult = value;
    }

}
