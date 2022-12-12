package wsClient.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import proxy.Contact;
import proxy.ContactService;
import proxy.Exception_Exception;
import proxy.GestionContacts;
import wsClient.model.ContactModel;

@WebServlet(name = "contactController",urlPatterns = {"/wsContactsManager.do"})
public class ContactController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	//stub est le MidleWare avec le serveur soap_wsServer_Contact (jax-ws)
	static ContactService stub;
	
	@Override
	public void init() throws ServletException {
		stub = new GestionContacts().getContactServicePort();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String result = req.getParameter("call");
		if(req.getParameter("call") == null) {
			req.getRequestDispatcher("Acceuil.jsp").forward(req, resp);
		}
		else {
			result = req.getParameter("call");
			if(result.equalsIgnoreCase("getAll")) {
			try {
				List<Contact> listContacts = stub.listConctacts();
	
				listContacts.forEach(c->{
					System.out.print("id:"+c.getId()+"\t");
					System.out.print("nom:"+c.getNom()+"\t");
					System.out.print("mail:"+c.getMail()+"\n");
				});
				
				req.setAttribute("listContacts", listContacts);
				req.getRequestDispatcher("ListContacts.jsp").forward(req, resp);
			} catch (Exception_Exception e) {
				e.printStackTrace();
				}
			}else if (result.equalsIgnoreCase("search")) {
				String nomContact = "";
				List<Contact> listContacts = new ArrayList<Contact>();
				System.out.println("***1"+ nomContact +"1***");
				System.out.println(listContacts);
				req.setAttribute("listContacts", listContacts);
				req.setAttribute("nomContact", nomContact);
				System.out.println("forwarding....");
				req.getRequestDispatcher("SearchContacts.jsp").forward(req, resp);
			}else if (result.equalsIgnoreCase("save")) {
				Contact tempContact = new Contact();
				req.setAttribute("tempContact", tempContact);
				req.getRequestDispatcher("SaveContact.jsp").forward(req, resp);
				//***************
			}else {// result == "delete" or result == edit
				try {
					List<Contact> listContacts  = stub.listConctacts();
					req.setAttribute("listContacts", listContacts);
					req.getRequestDispatcher("ListContacts.jsp").forward(req, resp);
				} catch (Exception_Exception e) {
					e.printStackTrace();
				}
			}
		}//fin [req.getParameter("call") != null]
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("call")!=null) {
			String result = req.getParameter("call");
			if(result.equalsIgnoreCase("search")) {
				String nomContact = req.getParameter("nomContact");
				System.out.println("DoPost called....");
				try {
					List<Contact> listContacts = stub.searchContact(nomContact);
					req.setAttribute("listContacts", listContacts);
					req.setAttribute("nomContact", nomContact);
					System.out.println("forwarding dans Post....");
					req.getRequestDispatcher("SearchContacts.jsp").forward(req, resp);
				} catch (Exception_Exception e) {
					e.printStackTrace();
				}
			}else if (result.equalsIgnoreCase("save")) {
				int contactId = Integer.valueOf(req.getParameter("contactId"));
				String nomContact = req.getParameter("nomContact");
				String mailContact = req.getParameter("mailContact");
				//*********************************
//				System.out.println("++++++++");
//				System.out.println(nomContact);
//				System.out.println(mailContact);
//				System.out.println(contactId);
//				System.out.println("++++++++");
				//*********************************
				if(contactId==0) {
					Contact contactTemp = new Contact();
					contactTemp.setMail(mailContact);
					contactTemp.setNom(nomContact);
					try {
						Contact savedContact = stub.createContact(contactTemp);
//						System.out.print(savedContact.getId()+" ");
//						System.out.print(savedContact.getNom()+" ");
//						System.out.println(savedContact.getMail());
						List<Contact> listContacts = new ArrayList<Contact>();
						listContacts.add(savedContact);
						req.setAttribute("listContacts", listContacts);
					} catch (Exception_Exception e) {
						e.printStackTrace();
					}
					req.getRequestDispatcher("ListContacts.jsp").forward(req, resp);
				}else {
					System.out.println("Modification de contact...");
					Contact newValueOfContact = new Contact();
					newValueOfContact.setId(contactId);
					newValueOfContact.setMail(mailContact);
					newValueOfContact.setNom(nomContact);
					try {
						Contact editedContact = stub.editeContact(newValueOfContact);
						//*********************************
//						System.out.println("++++++++");
//						System.out.println(editedContact.getId());
//						System.out.println(editedContact.getMail());
//						System.out.println(editedContact.getNom());
//						System.out.println("++++++++");
						List<Contact> listContacts = new ArrayList<Contact>();
						listContacts.add(editedContact);
						req.setAttribute("listContacts", listContacts);
						req.getRequestDispatcher("ListContacts.jsp").forward(req, resp);
						//*********************************
					} catch (Exception_Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		if(req.getParameter("doAction")!=null) {
			String doAction = req.getParameter("doAction");
			if(doAction.equalsIgnoreCase("doEdit") || doAction.equalsIgnoreCase("doDelete")) 
			{
				String contactId = req.getParameter("contactId");
				String contactNom = req.getParameter("contactNom");
				String contactMail = req.getParameter("contactMail");
//				System.out.println("pppppppppppppp");
//				System.out.println(contactId);
//				System.out.println(contactNom);
//				System.out.println(contactMail);
//				System.out.println("pppppppppppppp");
				switch (doAction) {
					case "doEdit":{
						// faire traitement et modif pour ecraser l'existant
						System.out.println(contactId);
						System.out.println("/////////");
						Contact newValue = new Contact();
						newValue.setId(Integer.valueOf(contactId));
//						stub.editeContact(newValue);
						req.setAttribute("tempContact",newValue);
						req.getRequestDispatcher("SaveContact.jsp").forward(req, resp);
						break;
					}
					case "doDelete":{
						try {
							String removeResult = stub.removeContact(Integer.valueOf(contactId));
							System.out.println(removeResult);
							System.out.println("finished.....");
							
							List<Contact> listContacts = stub.listConctacts();
							req.setAttribute("listContacts", listContacts);
							req.getRequestDispatcher("ListContacts.jsp").forward(req, resp);
						} catch (NumberFormatException | Exception_Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					}
				}
			}
		}
	}
	
}
