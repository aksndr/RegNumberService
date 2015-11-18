
package ru.terralink.regnumservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfRegNumber complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfRegNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegNumber" type="{http://schemas.datacontract.org/2004/07/NNxRegNumberService}RegNumber" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRegNumber", namespace = "http://schemas.datacontract.org/2004/07/NNxRegNumberService", propOrder = {
        "regNumber"
})
public class ArrayOfRegNumber {

    @XmlElement(name = "RegNumber", nillable = true)
    protected List<RegNumber> regNumber;

    /**
     * Gets the value of the regNumber property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regNumber property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegNumber().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link RegNumber }
     */
    public List<RegNumber> getRegNumber() {
        if (regNumber == null) {
            regNumber = new ArrayList<RegNumber>();
        }
        return this.regNumber;
    }

}
