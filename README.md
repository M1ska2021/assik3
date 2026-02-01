 ##Assignment 4 – SOLID Architecture & Advanced OOP
 
Cartoon Management System (Java + JDBC)
Project Overview

 #This project is a refactored version of Assignment 3 and was developed to demonstrate SOLID principles and advanced Object-Oriented Programming features in Java. The application represents a Cartoon Management System that allows creating, reading, updating, and deleting cartoon entities using a layered architecture and a PostgreSQL database.
 #1. SOLID Principles Application
 #Single Responsibility Principle (SRP)
Each class in the project has a single responsibility. Model classes represent data only, repository classes handle database operations, service classes contain business logic and validation, and the Main class is used only for application execution and demonstration.
 #Open–Closed Principle (OCP)
The abstract base class Cartoon can be extended by new cartoon types without modifying existing logic. New subclasses can be added safely.
 #Liskov Substitution Principle (LSP)
Subclasses such as MovieCartoon and SeriesCartoon can be used through the base type Cartoon without breaking the program logic.
 #Interface Segregation Principle (ISP)
The repository layer uses a small and focused generic interface CrudRepository<T> that contains only CRUD-related methods.
 #Dependency Inversion Principle (DIP)
The service layer depends on the CrudRepository<Cartoon> interface instead of a concrete repository implementation. The repository is injected through the constructor.
 #2. Advanced Object-Oriented Programming Features
 #Abstract Classes and Polymorphism
Cartoon is an abstract base class that defines common fields and abstract behavior. Subclasses override abstract methods and provide their own implementations.
 #Interfaces
The CrudRepository<T> interface defines generic CRUD operations and is implemented by CartoonRepository.
 #Generics
Generics are used in the repository interface to allow reusable CRUD logic for different entity types.
 #Lambda Expressions
Lambda expressions are used when processing collections, for example when printing or sorting cartoon lists.
 #Reflection (RTTI)
A reflection utility class can inspect class names, fields, and methods at runtime to demonstrate runtime type information.
 #3. Layered Architecture
 #Controller / Main Layer
The Main class acts as a simple controller that demonstrates system functionality and delegates all logic to the service layer.
 #Service Layer
CartoonService applies validation rules, handles business logic, and throws custom exceptions when errors occur.
 #Repository Layer
CartoonRepository implements the CrudRepository<Cartoon> interface and communicates with the database using JDBC. It does not contain business logic.
 #Database Layer
A PostgreSQL database is used to store cartoon data.
 #4. Exception Handling
The project uses a custom exception hierarchy:
 #InvalidInputException
 #DuplicateResourceException
 #ResourceNotFoundException
 #DatabaseOperationException
All exceptions are applied inside the service layer according to the assignment requirements.
 #5. Database Design
The database contains at least two related entities and supports CRUD operations. The schema includes primary keys, constraints, and sample insert data. JDBC is used for all database interactions.
 #6. Functional Demonstration
The application demonstrates:
Creating multiple cartoons
Fetching and displaying all cartoons
Input validation and exception handling
Polymorphic behavior through base class references
Layered SOLID architecture in action
 #7. How to Run the Project
Make sure Java and PostgreSQL are installed
Create the database and tables using the provided schema
Configure database connection settings
Run the Main class
 #8. Reflection and Learning Outcome
Through this project, I learned how to properly apply SOLID principles, structure a Java application using clean architecture, use advanced OOP concepts, and understand the benefits of abstraction, interfaces, and dependency inversion in real-world applications.
