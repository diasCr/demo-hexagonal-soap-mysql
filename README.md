# demo-hexagonal-soap-mysql

This is a project to demonstrate an implementation of the hexagonal architecture. The focus is the package `java.ch.cristiano.demo`. Here you will find the application and the adapter parts.

The `application`-package contains the domain model, the inbound ports, the outbound ports and the service implementation as well.

The `adapter`-package contains the implementantions of the in- and out-interactions (also known as driving and driven adapters). Like the communication with a database or the SOAP interface an UI-client i.e.

You can find a good explanation about the topic here: [Hexagonal Architecture, there are always two sides to every story](https://medium.com/ssense-tech/hexagonal-architecture-there-are-always-two-sides-to-every-story-bc0780ed7d9c)

# Openliberty installation
## Preconditions
- Maven is installed
- Database is running - see [Database configuration](#database-configuration)

## Start application server in DEV mode
    > mvn liberty:dev

    # without DEV mode
    > mvn liberty:start

## Call web application
Call im Browser `http://localhost:9080/demo-hexagonal-soap-mysql/person?wsdl`

## Stop application server
    > mvn liverty:stop

# Database configuration

Under [demo.sql](/src/main/resources/sql/demo.sql) you will find a initial script to setup the database. Addtionally you can change the configurations if necessary under [server.xml](src/main/liberty/config/server.xml)

    <variable name="DB_HOST" defaultValue="localhost" />
    <variable name="DB_PORT" defaultValue="3306" />
    <variable name="DB_NAME" defaultValue="demo" />
    <variable name="DB_USER" defaultValue="demouser" />
    <variable name="DB_PASSWORD" defaultValue="geheim" />
