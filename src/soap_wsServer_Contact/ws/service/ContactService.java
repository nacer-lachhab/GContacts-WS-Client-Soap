package soap_wsServer_Contact.ws.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import soap_wsServer_Contact.dao.ContactDaoImp;
import soap_wsServer_Contact.dao.IContactDao;
import soap_wsServer_Contact.entities.Contact;

@WebService(serviceName = "Gestion_Contacts")
public class ContactService {
	
	IContactDao contactDao = new ContactDaoImp();
	
	@WebMethod(operationName = "Search_Contact")
	public List<Contact> getContactsByName(
			@WebParam(name = "nameContact")String name) throws Exception {
		return contactDao.getContactsByName(name);
	}
	
	@WebMethod(operationName = "List_Conctacts")
	public List<Contact> allContacts() throws Exception {
		return contactDao.allContacts();
	}
	
	@WebMethod(operationName = "Create_Contact")
	public Contact saveContact(
			@WebParam(name = "newContact")Contact newContact) throws Exception{
		return contactDao.saveContact(newContact);
	}
	
	@WebMethod(operationName = "Edite_Contact")
	public Contact updateContact(
			@WebParam(name = "newValues")Contact updatedContact) throws Exception{
		return contactDao.updateContact(updatedContact);
	}
	
	@WebMethod(operationName = "Remove_Contact")
	public String deleteContact(int id) throws Exception{
		boolean result = contactDao.deleteContact(id); 
		if(result)
			return "element avec id= "+id+" est supprimee..";
		return "aucun element supprimee!!!!";
	}
}
