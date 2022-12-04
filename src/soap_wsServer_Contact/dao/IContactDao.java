package soap_wsServer_Contact.dao;

import java.sql.SQLException;
import java.util.List;

import soap_wsServer_Contact.entities.Contact;

public interface IContactDao {

	public List<Contact> getContactsByName(String name) throws Exception;
	public List<Contact> allContacts() throws Exception;
	public Contact saveContact(Contact newContact) throws Exception;
	public Contact updateContact(Contact updatedContact) throws Exception;
	public Boolean deleteContact(int id) throws Exception;
}
