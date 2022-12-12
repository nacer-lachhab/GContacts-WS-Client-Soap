
package proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchContact_QNAME = new QName("http://service.ws.soap_wsServer_Contact/", "Search_Contact");
    private final static QName _Exception_QNAME = new QName("http://service.ws.soap_wsServer_Contact/", "Exception");
    private final static QName _ListConctacts_QNAME = new QName("http://service.ws.soap_wsServer_Contact/", "List_Conctacts");
    private final static QName _SearchContactResponse_QNAME = new QName("http://service.ws.soap_wsServer_Contact/", "Search_ContactResponse");
    private final static QName _CreateContactResponse_QNAME = new QName("http://service.ws.soap_wsServer_Contact/", "Create_ContactResponse");
    private final static QName _EditeContact_QNAME = new QName("http://service.ws.soap_wsServer_Contact/", "Edite_Contact");
    private final static QName _ListConctactsResponse_QNAME = new QName("http://service.ws.soap_wsServer_Contact/", "List_ConctactsResponse");
    private final static QName _CreateContact_QNAME = new QName("http://service.ws.soap_wsServer_Contact/", "Create_Contact");
    private final static QName _EditeContactResponse_QNAME = new QName("http://service.ws.soap_wsServer_Contact/", "Edite_ContactResponse");
    private final static QName _RemoveContact_QNAME = new QName("http://service.ws.soap_wsServer_Contact/", "Remove_Contact");
    private final static QName _Contact_QNAME = new QName("http://service.ws.soap_wsServer_Contact/", "contact");
    private final static QName _RemoveContactResponse_QNAME = new QName("http://service.ws.soap_wsServer_Contact/", "Remove_ContactResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchContactResponse }
     * 
     */
    public SearchContactResponse createSearchContactResponse() {
        return new SearchContactResponse();
    }

    /**
     * Create an instance of {@link CreateContact }
     * 
     */
    public CreateContact createCreateContact() {
        return new CreateContact();
    }

    /**
     * Create an instance of {@link EditeContactResponse }
     * 
     */
    public EditeContactResponse createEditeContactResponse() {
        return new EditeContactResponse();
    }

    /**
     * Create an instance of {@link CreateContactResponse }
     * 
     */
    public CreateContactResponse createCreateContactResponse() {
        return new CreateContactResponse();
    }

    /**
     * Create an instance of {@link EditeContact }
     * 
     */
    public EditeContact createEditeContact() {
        return new EditeContact();
    }

    /**
     * Create an instance of {@link ListConctactsResponse }
     * 
     */
    public ListConctactsResponse createListConctactsResponse() {
        return new ListConctactsResponse();
    }

    /**
     * Create an instance of {@link RemoveContactResponse }
     * 
     */
    public RemoveContactResponse createRemoveContactResponse() {
        return new RemoveContactResponse();
    }

    /**
     * Create an instance of {@link RemoveContact }
     * 
     */
    public RemoveContact createRemoveContact() {
        return new RemoveContact();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link SearchContact }
     * 
     */
    public SearchContact createSearchContact() {
        return new SearchContact();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link ListConctacts }
     * 
     */
    public ListConctacts createListConctacts() {
        return new ListConctacts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.soap_wsServer_Contact/", name = "Search_Contact")
    public JAXBElement<SearchContact> createSearchContact(SearchContact value) {
        return new JAXBElement<SearchContact>(_SearchContact_QNAME, SearchContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.soap_wsServer_Contact/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListConctacts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.soap_wsServer_Contact/", name = "List_Conctacts")
    public JAXBElement<ListConctacts> createListConctacts(ListConctacts value) {
        return new JAXBElement<ListConctacts>(_ListConctacts_QNAME, ListConctacts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.soap_wsServer_Contact/", name = "Search_ContactResponse")
    public JAXBElement<SearchContactResponse> createSearchContactResponse(SearchContactResponse value) {
        return new JAXBElement<SearchContactResponse>(_SearchContactResponse_QNAME, SearchContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.soap_wsServer_Contact/", name = "Create_ContactResponse")
    public JAXBElement<CreateContactResponse> createCreateContactResponse(CreateContactResponse value) {
        return new JAXBElement<CreateContactResponse>(_CreateContactResponse_QNAME, CreateContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditeContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.soap_wsServer_Contact/", name = "Edite_Contact")
    public JAXBElement<EditeContact> createEditeContact(EditeContact value) {
        return new JAXBElement<EditeContact>(_EditeContact_QNAME, EditeContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListConctactsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.soap_wsServer_Contact/", name = "List_ConctactsResponse")
    public JAXBElement<ListConctactsResponse> createListConctactsResponse(ListConctactsResponse value) {
        return new JAXBElement<ListConctactsResponse>(_ListConctactsResponse_QNAME, ListConctactsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.soap_wsServer_Contact/", name = "Create_Contact")
    public JAXBElement<CreateContact> createCreateContact(CreateContact value) {
        return new JAXBElement<CreateContact>(_CreateContact_QNAME, CreateContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditeContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.soap_wsServer_Contact/", name = "Edite_ContactResponse")
    public JAXBElement<EditeContactResponse> createEditeContactResponse(EditeContactResponse value) {
        return new JAXBElement<EditeContactResponse>(_EditeContactResponse_QNAME, EditeContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.soap_wsServer_Contact/", name = "Remove_Contact")
    public JAXBElement<RemoveContact> createRemoveContact(RemoveContact value) {
        return new JAXBElement<RemoveContact>(_RemoveContact_QNAME, RemoveContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.soap_wsServer_Contact/", name = "contact")
    public JAXBElement<Contact> createContact(Contact value) {
        return new JAXBElement<Contact>(_Contact_QNAME, Contact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.soap_wsServer_Contact/", name = "Remove_ContactResponse")
    public JAXBElement<RemoveContactResponse> createRemoveContactResponse(RemoveContactResponse value) {
        return new JAXBElement<RemoveContactResponse>(_RemoveContactResponse_QNAME, RemoveContactResponse.class, null, value);
    }

}
