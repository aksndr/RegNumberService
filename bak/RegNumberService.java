
package ru.terralink.regnumservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.spi.Provider;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RegNumberService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://ot-nntest.terralink.ru/SAPDM.Web.RegNumbers/Service/RegNumberService.svc?wsdl")
public class RegNumberService extends Service
{

    private final static URL REGNUMBERSERVICE_WSDL_LOCATION;
    private final static WebServiceException REGNUMBERSERVICE_EXCEPTION;
    private final static QName REGNUMBERSERVICE_QNAME = new QName("http://tempuri.org/", "RegNumberService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ot-nntest.terralink.ru/SAPDM.Web.RegNumbers/Service/RegNumberService.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REGNUMBERSERVICE_WSDL_LOCATION = url;
        REGNUMBERSERVICE_EXCEPTION = e;
    }

    public RegNumberService() {
        super(__getWsdlLocation(), REGNUMBERSERVICE_QNAME);
    }

    public RegNumberService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REGNUMBERSERVICE_QNAME, features);
    }

    public RegNumberService(URL wsdlLocation) {
        super(wsdlLocation, REGNUMBERSERVICE_QNAME);
    }

    public RegNumberService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REGNUMBERSERVICE_QNAME, features);
    }

    public RegNumberService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RegNumberService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IRegNumberService
     */
    @WebEndpoint(name = "BasicHttpBinding_IRegNumberService")
    public IRegNumberService getBasicHttpBindingIRegNumberService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IRegNumberService"), IRegNumberService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IRegNumberService
     */
    @WebEndpoint(name = "BasicHttpBinding_IRegNumberService")
    public IRegNumberService getBasicHttpBindingIRegNumberService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IRegNumberService"), IRegNumberService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REGNUMBERSERVICE_EXCEPTION!= null) {
            throw REGNUMBERSERVICE_EXCEPTION;
        }
        return REGNUMBERSERVICE_WSDL_LOCATION;
    }

}
