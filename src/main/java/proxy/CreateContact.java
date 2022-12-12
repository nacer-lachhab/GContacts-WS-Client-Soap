
package proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Create_Contact complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Create_Contact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newContact" type="{http://service.ws.soap_wsServer_Contact/}contact" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Create_Contact", propOrder = {
    "newContact"
})
public class CreateContact {

    protected Contact newContact;

    /**
     * Obtient la valeur de la propriété newContact.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getNewContact() {
        return newContact;
    }

    /**
     * Définit la valeur de la propriété newContact.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setNewContact(Contact value) {
        this.newContact = value;
    }

}
