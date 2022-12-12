package wsClient.model;

public class ContactModel {

	private int id;
	private String nom;
	private String mail;
	
	public ContactModel() {
		super();
	}

	public ContactModel(String nom, String mail) {
		super();
		this.nom = nom;
		this.mail = mail;
	}

	public ContactModel(int id, String nom, String mail) {
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
		return "ContactModel [id=" + id + ", nom=" + nom + ", mail=" + mail + "]";
	}
}
