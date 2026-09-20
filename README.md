# E-Commerce Backend API

## 📌 Project Overview

This is a simple E-Commerce Backend Application developed using Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL.

The application provides REST APIs for managing products in an e-commerce system. Currently, it supports adding products to a MySQL database through Postman.

The project follows a layered architecture:

Controller → Service → Repository → Database

---

## 🚀 Technologies Used

### Backend
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven

### Database
- MySQL

### Tools
- Eclipse IDE
- MySQL Workbench
- Postman
- Git & GitHub

---

## 📂 Project Structure

src/main/java

com.example.ecommerce

├── EcommerceApplication.java

├── controller

│ └── EcommerceController.java

├── service

│ └── EcommerceService.java

├── dao

│ └── EcommerceRepo.java

├── model

│ └── Ecommerce.java


src/main/resources

└── application.properties

---

## 🏗️ Architecture

### Model Layer
Represents the Product entity and maps it to the database table using JPA annotations.

Fields:
- id
- pname
- price
- quantity
- description

### Repository Layer
Handles database operations using JpaRepository.

### Service Layer
Contains business logic and communicates with the repository layer.

### Controller Layer
Exposes REST APIs and handles incoming HTTP requests.

---

## ⚙️ Database Configuration

Configure MySQL database credentials in:

src/main/resources/application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecom
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 🗄️ MySQL Setup

### Step 1: Open MySQL Workbench

Create a database:

```sql
CREATE DATABASE ecom;
```

### Step 2: Verify Database

```sql
SHOW DATABASES;
```

You should see:

```sql
ecom
```

---

## ▶️ Running the Application

### Step 1: Open Project in Eclipse

- Import Existing Maven Project
- Wait for Maven dependencies to download

### Step 2: Configure Database

Update username and password in:

application.properties

### Step 3: Run Application

Run:

```java
EcommerceApplication.java
```

If successful, Spring Boot starts on:

```
http://localhost:8080
```

---

## 📬 API Testing Using Postman

### Add Product

#### Request

Method:

```
POST
```

URL:

```
http://localhost:8080/addprod
```

Headers:

```
Content-Type: application/json
```

Body (Raw JSON):

```json
{
  "pname": "Laptop",
  "price": 65000,
  "quantity": 10,
  "description": "Gaming Laptop"
}
```

### Response

```json
{
  "id": 1,
  "pname": "Laptop",
  "price": 65000.0,
  "quantity": 10,
  "description": "Gaming Laptop"
}
```

---

## 🔄 Request Flow

1. User sends request from Postman.
2. Controller receives request.
3. Service processes request.
4. Repository communicates with MySQL.
5. Product data is saved.
6. Response is returned to Postman.

Flow:

Postman
↓
Controller
↓
Service
↓
Repository
↓
MySQL Database

---

## 📊 Sample Database Record

| id | pname | price | quantity | description |
|----|--------|--------|----------|-------------|
| 1 | Laptop | 65000 | 10 | Gaming Laptop |

---

## 🎯 Learning Outcomes

Through this project, I learned:

- Spring Boot application setup
- REST API development
- Layered architecture
- Dependency Injection
- Spring Data JPA
- Hibernate ORM
- MySQL integration
- Postman API testing
- Maven project management
- Git and GitHub version control

---

## 🔮 Future Enhancements

- Get All Products API
- Get Product By ID API
- Update Product API
- Delete Product API
- Exception Handling
- Validation
- Swagger Documentation
- Spring Security & JWT Authentication
- Product Search & Filtering

---

## 👩‍💻 Author

Mahaswetha R

Java Full Stack Developer

GitHub:
https://github.com/mahaswetha05
