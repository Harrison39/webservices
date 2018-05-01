
package com.customer.service.types.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.customer.service.types.v1 package. 
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

    private final static QName _UpdateCustomerFault_QNAME = new QName("http://service.customer.com/types/v1", "updateCustomerFault");
    private final static QName _CreateCustomerResponse_QNAME = new QName("http://service.customer.com/types/v1", "createCustomerResponse");
    private final static QName _CreateCustomerRequest_QNAME = new QName("http://service.customer.com/types/v1", "createCustomerRequest");
    private final static QName _UpdateCustomerRequest_QNAME = new QName("http://service.customer.com/types/v1", "updateCustomerRequest");
    private final static QName _UpdateCustomerResponse_QNAME = new QName("http://service.customer.com/types/v1", "updateCustomerResponse");
    private final static QName _DeleteCustomerRequest_QNAME = new QName("http://service.customer.com/types/v1", "deleteCustomerRequest");
    private final static QName _DeleteCustomerFault_QNAME = new QName("http://service.customer.com/types/v1", "deleteCustomerFault");
    private final static QName _CreateCustomerFault_QNAME = new QName("http://service.customer.com/types/v1", "createCustomerFault");
    private final static QName _DeleteCustomerResponse_QNAME = new QName("http://service.customer.com/types/v1", "deleteCustomerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.customer.service.types.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateCustomerRequest }
     * 
     */
    public UpdateCustomerRequest createUpdateCustomerRequest() {
        return new UpdateCustomerRequest();
    }

    /**
     * Create an instance of {@link DeleteCustomerResponse }
     * 
     */
    public DeleteCustomerResponse createDeleteCustomerResponse() {
        return new DeleteCustomerResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomerRequest }
     * 
     */
    public DeleteCustomerRequest createDeleteCustomerRequest() {
        return new DeleteCustomerRequest();
    }

    /**
     * Create an instance of {@link DeleteCustomerFault }
     * 
     */
    public DeleteCustomerFault createDeleteCustomerFault() {
        return new DeleteCustomerFault();
    }

    /**
     * Create an instance of {@link UpdateCustomerFault }
     * 
     */
    public UpdateCustomerFault createUpdateCustomerFault() {
        return new UpdateCustomerFault();
    }

    /**
     * Create an instance of {@link UpdateCustomerResponse }
     * 
     */
    public UpdateCustomerResponse createUpdateCustomerResponse() {
        return new UpdateCustomerResponse();
    }

    /**
     * Create an instance of {@link CreateCustomerFault }
     * 
     */
    public CreateCustomerFault createCreateCustomerFault() {
        return new CreateCustomerFault();
    }

    /**
     * Create an instance of {@link CreateCustomerRequest }
     * 
     */
    public CreateCustomerRequest createCreateCustomerRequest() {
        return new CreateCustomerRequest();
    }

    /**
     * Create an instance of {@link CreateCustomerResponse }
     * 
     */
    public CreateCustomerResponse createCreateCustomerResponse() {
        return new CreateCustomerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.customer.com/types/v1", name = "updateCustomerFault")
    public JAXBElement<UpdateCustomerFault> createUpdateCustomerFault(UpdateCustomerFault value) {
        return new JAXBElement<UpdateCustomerFault>(_UpdateCustomerFault_QNAME, UpdateCustomerFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.customer.com/types/v1", name = "createCustomerResponse")
    public JAXBElement<CreateCustomerResponse> createCreateCustomerResponse(CreateCustomerResponse value) {
        return new JAXBElement<CreateCustomerResponse>(_CreateCustomerResponse_QNAME, CreateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.customer.com/types/v1", name = "createCustomerRequest")
    public JAXBElement<CreateCustomerRequest> createCreateCustomerRequest(CreateCustomerRequest value) {
        return new JAXBElement<CreateCustomerRequest>(_CreateCustomerRequest_QNAME, CreateCustomerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.customer.com/types/v1", name = "updateCustomerRequest")
    public JAXBElement<UpdateCustomerRequest> createUpdateCustomerRequest(UpdateCustomerRequest value) {
        return new JAXBElement<UpdateCustomerRequest>(_UpdateCustomerRequest_QNAME, UpdateCustomerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.customer.com/types/v1", name = "updateCustomerResponse")
    public JAXBElement<UpdateCustomerResponse> createUpdateCustomerResponse(UpdateCustomerResponse value) {
        return new JAXBElement<UpdateCustomerResponse>(_UpdateCustomerResponse_QNAME, UpdateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.customer.com/types/v1", name = "deleteCustomerRequest")
    public JAXBElement<DeleteCustomerRequest> createDeleteCustomerRequest(DeleteCustomerRequest value) {
        return new JAXBElement<DeleteCustomerRequest>(_DeleteCustomerRequest_QNAME, DeleteCustomerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.customer.com/types/v1", name = "deleteCustomerFault")
    public JAXBElement<DeleteCustomerFault> createDeleteCustomerFault(DeleteCustomerFault value) {
        return new JAXBElement<DeleteCustomerFault>(_DeleteCustomerFault_QNAME, DeleteCustomerFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomerFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.customer.com/types/v1", name = "createCustomerFault")
    public JAXBElement<CreateCustomerFault> createCreateCustomerFault(CreateCustomerFault value) {
        return new JAXBElement<CreateCustomerFault>(_CreateCustomerFault_QNAME, CreateCustomerFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.customer.com/types/v1", name = "deleteCustomerResponse")
    public JAXBElement<DeleteCustomerResponse> createDeleteCustomerResponse(DeleteCustomerResponse value) {
        return new JAXBElement<DeleteCustomerResponse>(_DeleteCustomerResponse_QNAME, DeleteCustomerResponse.class, null, value);
    }

}
