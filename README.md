# PatientDatabase
A simple web service that stores patient information, built using Spring, AngularJS, and Java.

After cloning the repository, run the following two lines to start the application:

`mvn package`

`mvn exec:java`

The application will run on `http://localhost:8080/patient`

In order to view the database, visit `http://localhost:8080/h2-console` and use the following login information:

`JDBC URL: jdbc:h2:mem:testdb`

`User Name: root`

`Password: ` 

(No password)

To view all records, simply execute the following query:

`SELECT * FROM patient`
