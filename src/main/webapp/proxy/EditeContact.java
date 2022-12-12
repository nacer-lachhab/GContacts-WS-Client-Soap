
package proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Edite_Contact complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Edite_Contact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newValues" type="{http://service.ws.soap_wsServer_Contact/}contact" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Edite_Contact", propOrder = {
    "newValues"
})
public class EditeContact {

    protected Contact newValues;

    /**
     * Obtient la valeur de la propriété newValues.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getNewValues() {
        return newValues;
    }

    /**
     * Définit la valeur de la propriété newValues.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setNewValues(Contact value) {
        this.newValues = value;
    }

}
