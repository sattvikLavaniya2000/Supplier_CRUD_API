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




**Supplier  Details:**

1. supplier_id : unique identifier for each supplier
2. company_name
3. website
4. location : city, assuming one supplier_id maps to just one location
5. nature_of_business : Possible values: small_scale, medium_scale, large_scale
6. manufacturing_processes : Possible values for POC: moulding, 3d_printing, casting, coating
