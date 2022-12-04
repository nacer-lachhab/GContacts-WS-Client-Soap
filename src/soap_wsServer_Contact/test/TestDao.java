package soap_wsServer_Contact.test;

import java.util.List;
import java.util.Scanner;

import soap_wsServer_Contact.dao.ContactDaoImp;
import soap_wsServer_Contact.entities.Contact;

public class TestDao {

	public static void main(String[] args) throws Exception{
		ContactDaoImp daoImp = new ContactDaoImp();
		Scanner sc = new Scanner(System.in);
		System.out.println("saisissez le nom");
		String nom= sc.nextLine();
		if(nom.equals("-")){
			System.out.println("saisissez l'id de l element a supprimer: ");
			int id= sc.nextInt();
			daoImp.deleteContact(id);
			System.out.println("terminé....");
			System.exit(0);
		}else if (nom.equals("modifier")) {
			System.out.println("operation de modification declanché.....");
			System.out.println("saisissez l'id du contact a modifier: ");
			int id= sc.nextInt();
			sc.nextLine();
			System.out.println("saisissez le nouveau nom du contact: ");
			String nom2= sc.nextLine();
			System.out.println("saisissez le mail nom du contact: ");
			String mail2= sc.nextLine();
			Contact updatedContact = new Contact(id,nom2, mail2);
			System.out.println(daoImp.updateContact(updatedContact));
			System.out.println("terminé....");
			System.exit(0);
		}
		System.out.println("saisissez le mail");
		String mail= sc.nextLine();
		Contact contact = new Contact(nom, mail);
		
		System.out.println("client added: \n"+daoImp.saveContact(contact));
		
		System.out.println("vous voulez cherchez un Contact: ");
		System.out.println("saisir non, sinon juste appuyez sur entrer....");
		nom= sc.nextLine();
		sc.close();
		if(nom.isEmpty()) {
			System.out.println("terminé....");
			System.exit(0);
		}else {
			if(nom.equals("*")) {
				System.out.println("tous les contacts: ");
				List<Contact> resultcontacts = daoImp.allContacts();
				resultcontacts.stream().forEach(c->System.out.println(c));
			}else {
				if(nom.equals("-")){
					
				}else {
					List<Contact> resultcontacts = daoImp.getContactsByName(nom);
					if(!resultcontacts.isEmpty())
						for (Contact result : resultcontacts) {
							System.out.println(result);
						}else
							System.out.println("aucun contact trouvé!!!");
				}
			}
			
		}
	}
}
