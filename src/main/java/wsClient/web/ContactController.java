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
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String result = req.getParameter("call");
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
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
		}
	}
}
