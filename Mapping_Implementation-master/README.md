<h1 align="center"> 
Mapping Practice</h1>
This project is a portal that handles various types of relationships, including one-to-one, one-to-many, many-to-one, and many-to-many. It also includes an embedded model. The project provides CRUD (Create, Read, Update, Delete) operations for each model.

>### Prerequisites
* MySql
 * SpringBoot


* Java

>## Installation

To run this application locally, you will need to have Java and MySQL installed on your machine.

* Clone the repository to your local machine.
* Create a new MySQL database called `Mapping Practice`
* Update the `application.properties` file in the `src/main/resources` directory to include your MySQL username and password
* Run the application using your IDE or by running the command `mvn spring-boot:run` in the project directory
* Access the APIs using any HTTP client such as Postman or cURL.
>## Data flow
 The application is built using the SpringBoot framework and consists of three layers: model, service, and repository.-

* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.

>## Schema
The project provides CRUD operations for each model, allowing you to perform the following actions:

>Student

* Create a new student
* Read student details
* Delete a student
>Laptop
* Create a new laptop
* Read laptop details
* Update laptop information
* Delete a laptop
>Course
* Create a new course
* Read course details
* Update course to students
* Delete a course
>Book
* Create a new book
* Read book details
	


>## Project Summary
This project demonstrates the implementation of various relationships, including one-to-one, one-to-many, many-to-one, and many-to-many, along with an embedded model. It provides CRUD operations for each model, allowing you to manage the data effectively. Feel free to explore and enhance the project as per your requirements.
