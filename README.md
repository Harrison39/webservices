# webservices

This is a SOAP Webservice developed using Java(1.8), Spring, Apache CXF, Apache Camel.

1) Service is created using the WSDL first method and codegen plugin is used to generate the JAXB classes.

2) Apache Camel is used for routing and making database calls using camel-sql component.

3) WSSE security is enabled using UserNameTokenValidaor and WSS4JInInterceptor.


4) Steps to deploy
  1) Build the service using maven
    mvn clean install 

  2) Open JBOSS fuse and install the below features

    features:install cxf-rt-security
    features:install cxf-ws-security
    features:install wss4j

  3) Install the bundle in Jboss fuse

    install -s mvn:com.customer.service/customer-service-impl/1.0.0

  4) Access the service using below url

    http://localhost:8181/cxf/customerservice
    
5) Test the service in soap ui by passing the wsse headers in the request

  <soapenv:Header>
      <wsse:Security soapenv:mustUnderstand="1" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd">
         <wsse:UsernameToken wsu:Id="UsernameToken-F434D320D890F7CF1715251639631263">
            <wsse:Username>admin</wsse:Username>
            <wsse:Password Type="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText">admin</wsse:Password>
         </wsse:UsernameToken>
      </wsse:Security>
   </soapenv:Header>



