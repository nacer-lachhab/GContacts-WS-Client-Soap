package soap_wsServer_Contact.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import soap_wsServer_Contact.entities.Contact;

public class ContactDaoImp implements IContactDao {
	
	Connection connection;

	@Override
	public List<Contact> getContactsByName(String name) throws Exception {
		List<Contact> contactsWithName = new ArrayList<>();
		connection = SingletonDbConnection.getConnection();
		PreparedStatement ps = connection
				.prepareStatement("SELECT * FROM CONTACTS WHERE NOM LIKE ?");
		ps.setString(1,"%"+name+"%");
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Contact contactTemp = 
					new Contact(rs.getInt("id"),rs.getString("nom"),rs.getString("mail"));
			contactsWithName.add(contactTemp);
		}
		return contactsWithName;
	}

	@Override
	public List<Contact> allContacts() throws Exception{
		List<Contact> contactsWithName = new ArrayList<>();
		connection = SingletonDbConnection.getConnection();
		PreparedStatement ps = connection
				.prepareStatement("SELECT * FROM CONTACTS");
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Contact contactTemp = 
					new Contact(rs.getInt("id"),rs.getString("nom"),rs.getString("mail"));
			contactsWithName.add(contactTemp);
		}
		return contactsWithName;
	}

	@Override
	public Contact saveContact(Contact newContact) throws Exception {
		connection = SingletonDbConnection.getConnection();
		PreparedStatement ps = connection
				.prepareStatement("INSERT INTO CONTACTS (nom,mail) VALUES (?,?)");
		ps.setString(1, newContact.getNom());
		ps.setString(2, newContact.getMail());
		ps.executeUpdate();
		PreparedStatement ps2 = connection
				.prepareStatement("SELECT MAX(ID) AS MAX_ID FROM CONTACTS");
		ResultSet rs = ps2.executeQuery();
		if(rs.next()) {
			newContact.setId(rs.getInt("MAX_ID"));
		}
		ps.close();
		return newContact;
	}

	@Override
	public Contact updateContact(Contact updatedContact) throws Exception{
		connection = SingletonDbConnection.getConnection();
		PreparedStatement ps = connection
				.prepareStatement("UPDATE CONTACTS SET NOM = ? ,MAIL = ? WHERE ID = ?");
		ps.setString(1, updatedContact.getNom());
		ps.setString(2, updatedContact.getMail());
		ps.setInt(3, updatedContact.getId());
		int rs = ps.executeUpdate();
		if(rs==1)
			return updatedContact;
		return null;
	}

	@Override
	public Boolean deleteContact(int id) throws Exception{
		boolean result;
		connection = SingletonDbConnection.getConnection();
		PreparedStatement ps = connection
				.prepareStatement("DELETE FROM CONTACTS WHERE ID = ?");
		ps.setInt(1, id);
		int rs = ps.executeUpdate();
		if(rs!=0) {
			System.out.println("element avec id= "+id+" est supprimee..");
			return (result=true);
		}
		System.out.println("aucun element supprimee!!!!");
		return (result=false);
	}

}
