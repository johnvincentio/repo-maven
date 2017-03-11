/**
 * HertzServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package generated.com.hertz.herc.rouse;

public class HertzServiceLocator extends org.apache.axis.client.Service implements generated.com.hertz.herc.rouse.HertzService {

    public HertzServiceLocator() {
    }


    public HertzServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HertzServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HertzServiceSoap
    private java.lang.String HertzServiceSoap_address = "http://www.rouseservices.com/Hertz/HertzService.asmx";

    public java.lang.String getHertzServiceSoapAddress() {
        return HertzServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HertzServiceSoapWSDDServiceName = "HertzServiceSoap";

    public java.lang.String getHertzServiceSoapWSDDServiceName() {
        return HertzServiceSoapWSDDServiceName;
    }

    public void setHertzServiceSoapWSDDServiceName(java.lang.String name) {
        HertzServiceSoapWSDDServiceName = name;
    }

    public generated.com.hertz.herc.rouse.HertzServiceSoap_PortType getHertzServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HertzServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHertzServiceSoap(endpoint);
    }

    public generated.com.hertz.herc.rouse.HertzServiceSoap_PortType getHertzServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            generated.com.hertz.herc.rouse.HertzServiceSoap_BindingStub _stub = new generated.com.hertz.herc.rouse.HertzServiceSoap_BindingStub(portAddress, this);
            _stub.setPortName(getHertzServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHertzServiceSoapEndpointAddress(java.lang.String address) {
        HertzServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (generated.com.hertz.herc.rouse.HertzServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                generated.com.hertz.herc.rouse.HertzServiceSoap_BindingStub _stub = new generated.com.hertz.herc.rouse.HertzServiceSoap_BindingStub(new java.net.URL(HertzServiceSoap_address), this);
                _stub.setPortName(getHertzServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HertzServiceSoap".equals(inputPortName)) {
            return getHertzServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.rouseservices.com/", "HertzService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.rouseservices.com/", "HertzServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HertzServiceSoap".equals(portName)) {
            setHertzServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
