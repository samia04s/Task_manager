# 🧩 Task Manager – Spring Boot Project

A simple **Task Management System** built using **Spring Boot**, **Hibernate (JPA)**, and **MySQL**.  
This project allows you to create, update, and track tasks under specific projects.

---

## 🚀 Tech Stack

- **Backend:** Spring Boot (REST API)
- **ORM:** Hibernate / JPA
- **Database:** MySQL
- **Build Tool:** Maven
- **IDE:** IntelliJ IDEA
- **Java Version:** 17+

---

## 🏗️ Project Structure

taskmanager/
├── src/
│ ├── main/
│ │ ├── java/com/example/taskmanager/
│ │ │ ├── controller/ # REST Controllers
│ │ │ ├── entity/ # JPA Entities
│ │ │ ├── repository/ # Spring Data JPA Repositories
│ │ │ ├── service/ # Business Logic
│ │ │ ├── dto/ # Data Transfer Objects
│ │ │ ├── exception/ # Custom Exceptions
│ │ │ └── TaskmanagerApplication.java
│ │ └── resources/
│ │ ├── application.properties
│ │ └── static / templates (if any)
│ └── test/
│ └── TaskmanagerApplicationTests.java
└── pom.xml

💾 Database Schema Overview

**Project Table**

id ,
name ,
description

**Task Table**

id ,
name ,
description ,
status ,
project_id (foreign key)

**🧠 Learning Goals**

1.Understand REST API design with Spring Boot

2.Practice using Hibernate ORM and MySQL integration

3.Learn CRUD operations and layered architecture

4.Build real-world APIs and test with Postman
