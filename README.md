# demo-hexagonal-soap-mysql

This is a project to demonstrate an implementation of the hexagonal architecture. The focus is the package java.ch.cristiano.demo. Here you will find the application and the adapter parts.

The application-package contains the domain model, the inbound ports, the outbound ports and the service implementation as well.

The adapter-package contains the implementantions in- and out-interactions. Like the communication with a database or the SOAP interface an UI-client i.e.

# Openliberty installation
## Preconditions
- Maven is installed

## Start application server in DEV mode
    > mvn liberty:dev

    # without DEV mode
    > mvn liberty:start

## Call web application
Call im Browser `http://localhost:9080/demo-hexagonal-soap-mysql/person?wsdl`

## Stop application server
    > mvn liverty:stop