package soap_wsServer_Contact.ws;

import javax.xml.ws.Endpoint;

import soap_wsServer_Contact.ws.service.ContactService;

public class GContactsServerJaxWs {

	public static void main(String[] args) {
		Endpoint.publish("http://0.0.0.0:9999/",new ContactService());
		System.out.println("Welcome on GContacts Server JaxWs....");
		System.out.println("webservice deploye sur l adresse: http://0.0.0.0:9999/");
	}
}
