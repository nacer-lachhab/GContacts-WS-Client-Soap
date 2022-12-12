
package proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Search_Contact complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Search_Contact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_Contact", propOrder = {
    "nameContact"
})
public class SearchContact {

    protected String nameContact;

    /**
     * Obtient la valeur de la propri�t� nameContact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameContact() {
        return nameContact;
    }

    /**
     * D�finit la valeur de la propri�t� nameContact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameContact(String value) {
        this.nameContact = value;
    }

}
