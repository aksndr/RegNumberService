
package ru.terralink.regnumservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRegNumberRest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRegNumberRest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegNumberRest" type="{http://schemas.datacontract.org/2004/07/SAPDM.X5.Web.RegNumbers}RegNumberRest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRegNumberRest", namespace = "http://schemas.datacontract.org/2004/07/SAPDM.X5.Web.RegNumbers", propOrder = {
    "regNumberRest"
})
public class ArrayOfRegNumberRest {

    @XmlElement(name = "RegNumberRest", nillable = true)
    protected List<RegNumberRest> regNumberRest;

    /**
     * Gets the value of the regNumberRest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regNumberRest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegNumberRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegNumberRest }
     * 
     * 
     */
    public List<RegNumberRest> getRegNumberRest() {
        if (regNumberRest == null) {
            regNumberRest = new ArrayList<RegNumberRest>();
        }
        return this.regNumberRest;
    }

}
