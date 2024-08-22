# Supplier_CRUD_API

REST CRUD API with Spring Boot, Mysql, JPA and Hibernate
Steps to Setup
1. Clone the application

(https://github.com/sattvikLavaniya2000/Supplier_CRUD_API.git)

2. Create Mysql database

create database supplier_directory
create table supplier

3. Change mysql username and password as per your installation

open demo/demo/src/main/resources/application.properties

change spring.datasource.username and spring.datasource.password as per your mysql installation

4. Build and run the app through the main class of the program


The app will start running at http://localhost:8085.

Explore Rest APIs
The app defines following CRUD APIs.

GET /api/supplier

POST /api/supplier

GET /api/supplier/{supplierId}

PUT /api/supplier/{supplierId}

DELETE /api/supplier/{supplierId}
