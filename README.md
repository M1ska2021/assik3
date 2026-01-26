Project Description
  This project is a Java console application that manages a small cartoon library using a PostgreSQL database.
  It was created for Assignment 3 to demonstrate Object-Oriented Programming, JDBC, and exception handling.
  The application allows creating, reading, updating, and deleting cartoons.
Topic
  Cartoon Library
  The project works with cartoons produced by different studios.
Entities
  Cartoon (abstract class)
  MovieCartoon (extends Cartoon)
  SeriesCartoon (extends Cartoon)
  Studio
OOP Concepts Used
  Abstract Class
Cartoon is an abstract base class
Contains common fields and abstract methods
Inheritance
  MovieCartoon and SeriesCartoon extend Cartoon
Polymorphism
  Methods are called using a Cartoon reference but work differently depending on the object type
Composition
  Each Cartoon has a Studio
Encapsulation
  All fields are private
Access through getters and setters
Project Structure
src/
├── controller/
│   └── Main.java
├── model/
│   ├── Cartoon.java
│   ├── MovieCartoon.java
│   ├── SeriesCartoon.java
│   └── Studio.java
├── service/
│   └── CartoonService.java
├── repository/
│   └── CartoonRepository.java
├── exception/
│   ├── InvalidInputException.java
│   ├── DuplicateResourceException.java
│   ├── ResourceNotFoundException.java
│   └── DatabaseOperationException.java
└── utils/
    └── DatabaseConnection.java
Database: PostgreSQL
Tables:
  studio
  cartoon
Relationships:
  cartoon.studio_id to studio.id
SQL schema and sample inserts are stored in schema.sql.
JDBC
Uses DriverManager
Uses PreparedStatement (no Statement)
Database logic is separated from business logic
SQL errors are handled with custom exceptions
CRUD Operations
The following operations are implemented:
Create cartoon
Get all cartoons
Get cartoon by ID
Update cartoon
Delete cartoon
All CRUD operations are demonstrated in Main.java.
Exception Handling
Custom exceptions used in the project:
InvalidInputException
DuplicateResourceException
ResourceNotFoundException
DatabaseOperationException
They help control invalid input and database errors.
How to Run
Install PostgreSQL
Create a database
Run SQL script from schema.sql
Set database credentials in DatabaseConnection.java
Run Main.java
What I Learned
How to use JDBC with PostgreSQL
How to build a layered Java application
How to apply OOP principles in practice
How to handle errors using custom exceptions
Conclusion
This project meets all the requirements of Assignment 3 and demonstrates practical use of Java OOP, JDBC, and database interaction.
