package soap_wsServer_Contact.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "contact")
@XmlAccessorType(XmlAccessType.FIELD)
public class Contact implements Serializable{

	private static final long serialVersionUID = 1L;
	int id;
	String nom;
	String mail;
	
	public Contact() {
		super();
	}

	public Contact(String nom, String mail) {
		super();
		this.nom = nom;
		this.mail = mail;
	}

	public Contact(int id, String nom, String mail) {
		super();
		this.id = id;
		this.nom = nom;
		this.mail = mail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", nom=" + nom + ", mail=" + mail + "]";
	}
}
