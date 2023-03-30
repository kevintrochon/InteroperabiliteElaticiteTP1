
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _GetComptes_QNAME = new QName("http://services/", "getComptes");
    private final static QName _Compte_QNAME = new QName("http://services/", "compte");
    private final static QName _GetComptesResponse_QNAME = new QName("http://services/", "getComptesResponse");
    private final static QName _CalculKMoyenResponse_QNAME = new QName("http://services/", "calculKMoyenResponse");
    private final static QName _GetMoyenneResponse_QNAME = new QName("http://services/", "getMoyenneResponse");
    private final static QName _GetMoyenne_QNAME = new QName("http://services/", "getMoyenne");
    private final static QName _CalculKMoyen_QNAME = new QName("http://services/", "calculKMoyen");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculKMoyenResponse }
     * 
     */
    public CalculKMoyenResponse createCalculKMoyenResponse() {
        return new CalculKMoyenResponse();
    }

    /**
     * Create an instance of {@link GetMoyenneResponse }
     * 
     */
    public GetMoyenneResponse createGetMoyenneResponse() {
        return new GetMoyenneResponse();
    }

    /**
     * Create an instance of {@link CalculKMoyen }
     * 
     */
    public CalculKMoyen createCalculKMoyen() {
        return new CalculKMoyen();
    }

    /**
     * Create an instance of {@link GetMoyenne }
     * 
     */
    public GetMoyenne createGetMoyenne() {
        return new GetMoyenne();
    }

    /**
     * Create an instance of {@link GetComptes }
     * 
     */
    public GetComptes createGetComptes() {
        return new GetComptes();
    }

    /**
     * Create an instance of {@link GetComptesResponse }
     * 
     */
    public GetComptesResponse createGetComptesResponse() {
        return new GetComptesResponse();
    }

    /**
     * Create an instance of {@link CompteDataScience }
     * 
     */
    public CompteDataScience createCompteDataScience() {
        return new CompteDataScience();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getComptes")
    public JAXBElement<GetComptes> createGetComptes(GetComptes value) {
        return new JAXBElement<GetComptes>(_GetComptes_QNAME, GetComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteDataScience }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "compte")
    public JAXBElement<CompteDataScience> createCompte(CompteDataScience value) {
        return new JAXBElement<CompteDataScience>(_Compte_QNAME, CompteDataScience.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getComptesResponse")
    public JAXBElement<GetComptesResponse> createGetComptesResponse(GetComptesResponse value) {
        return new JAXBElement<GetComptesResponse>(_GetComptesResponse_QNAME, GetComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculKMoyenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "calculKMoyenResponse")
    public JAXBElement<CalculKMoyenResponse> createCalculKMoyenResponse(CalculKMoyenResponse value) {
        return new JAXBElement<CalculKMoyenResponse>(_CalculKMoyenResponse_QNAME, CalculKMoyenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoyenneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getMoyenneResponse")
    public JAXBElement<GetMoyenneResponse> createGetMoyenneResponse(GetMoyenneResponse value) {
        return new JAXBElement<GetMoyenneResponse>(_GetMoyenneResponse_QNAME, GetMoyenneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoyenne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getMoyenne")
    public JAXBElement<GetMoyenne> createGetMoyenne(GetMoyenne value) {
        return new JAXBElement<GetMoyenne>(_GetMoyenne_QNAME, GetMoyenne.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculKMoyen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "calculKMoyen")
    public JAXBElement<CalculKMoyen> createCalculKMoyen(CalculKMoyen value) {
        return new JAXBElement<CalculKMoyen>(_CalculKMoyen_QNAME, CalculKMoyen.class, null, value);
    }

}
