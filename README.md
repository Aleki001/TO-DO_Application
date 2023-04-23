
# Spring MVC CRUD Application - To-Do List

This is a basic Spring MVC CRUD (Create, Read, Update, Delete) application that implements a simple to-do list functionality. Users can create tasks, update existing tasks, delete tasks, and view the list of tasks. The application follows the Model-View-Controller (MVC) architectural pattern and uses Spring MVC framework to build the web-based user interface.

## Features

The to-do list application provides the following functionalities:

- Create Task: Users can create new tasks by submitting a task description through an input form. The task description is then stored in the database.

- Read Task: Users can view the list of existing tasks in the application. The tasks are displayed in a table format, showing the task description and any additional information, such as due date or priority.

- Update Task: Users can update the description of an existing task by submitting an updated description through an input form. The task is then updated in the database.

- Delete Task: Users can delete a task from the list by clicking on a delete button associated with the task. The task is then removed from the database.

## Technology Stack

The application uses the following technologies:

- Java: The application is built using Java programming language, which provides the core logic for processing user requests and managing the data.

- Spring MVC: The application leverages the Spring MVC framework, which provides the Model, View, and Controller components for implementing the MVC pattern. It handles user requests, manages form submissions, and maps requests to appropriate controllers.

- Spring Data JPA: The application uses Spring Data JPA, which provides a higher-level abstraction for performing CRUD operations on a relational database. It simplifies the interaction with the database and provides features like entity mapping, transaction management, and query generation.

- Hibernate: The application uses Hibernate as the JPA implementation, which provides an ORM (Object-Relational Mapping) solution for mapping Java objects to relational database tables.

- HTML/CSS/JavaScript: The application uses HTML, CSS, and JavaScript for building the user interface. HTML is used for creating the web pages, CSS for styling, and JavaScript for handling client-side interactions.

- Thymeleaf: The application uses Thymeleaf as the template engine for rendering views. Thymeleaf provides powerful template capabilities for generating dynamic HTML pages in Spring MVC applications.

- MySQL: The application uses MySQL as the relational database for storing task data. It uses JDBC (Java Database Connectivity) to establish a connection with the MySQL database and perform CRUD operations.

## Setup and Deployment

To run the application locally, follow these steps:

1. Clone the repository to your local machine.

2. Set up a H2 database and update the database configuration in the `application.properties` file with your database connection details.


3. Build the application using Maven or your preferred build tool.

4. Deploy the application on a web server, such as Apache Tomcat or Jetty.

5. Access the application through a web browser by navigating to the [localhost:8080] where the application is deployed.

## Conclusion

This is a basic Spring MVC CRUD application that provides a simple to-do list functionality. It demonstrates the use of Spring MVC framework, Spring Data JPA, Hibernate, and Thymeleaf for building a web-based user interface that allows users to create, read, update, and delete tasks. The application can serve as a starting point for building more complex CRUD applications with additional features and functionalities.



## Authors

- [Alex Kinyua](https://www.github.com/Aleki001)

