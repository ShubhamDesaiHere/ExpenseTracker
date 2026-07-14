# ExpenseTracker
# 💰 Expense Tracker REST API

A production-ready RESTful Expense Tracker backend built using **Spring Boot**, **Spring Data JPA**, and **MySQL**. The application provides secure and structured CRUD operations for managing personal expenses with validation and exception handling.

---

## 🚀 Features

- RESTful CRUD APIs
- Spring Boot 3
- Spring Data JPA (Hibernate)
- MySQL Database (Railway)
- Input Validation
- Global Exception Handling
- Layered Architecture
- Constructor Dependency Injection
- Maven Project
- Tested using Postman



## 🏗️ Architecture

Client
   │
   ▼
REST API (Controller)
   │
   ▼
Service Layer
   │
   ▼
Repository Layer
   │
   ▼
MySQL Database


 🛠 Tech Stack

| Technology | Purpose |
|------------|---------|
| Java 17 | Programming Language |
| Spring Boot | Backend Framework |
| Spring Web | REST APIs |
| Spring Data JPA | Database Operations |
| Hibernate | ORM |
| MySQL | Database |
| Railway | Cloud Database |
| Maven | Dependency Management |
| Postman | API Testing |

 📂 Project Structure


src
 ├── controller
 ├── service
 ├── repository
 ├── model
 ├── exception
 └── resources


 📡 REST API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | /expenses | Get all expenses |
| GET | /expenses/{id} | Get expense by ID |
| POST | /expenses | Create expense |
| PUT | /expenses/{id} | Update expense |
| DELETE | /expenses/{id} | Delete expense |


## 📦 Sample Request
json
{
    "description": "Pizza",
    "amount": 500,
    "category": "Food",
    "date": "2026-07-13"
}

 📥 Sample Response
json
{
    "id": 1,
    "description": "Pizza",
    "amount": 500,
    "category": "Food",
    "date": "2026-07-13"
}


✅ Key Highlights

- Designed using layered architecture (Controller → Service → Repository)
- Uses JPA Repository to eliminate boilerplate SQL
- Validates incoming requests using Jakarta Validation
- Centralized exception handling using `@RestControllerAdvice`
- Cloud-hosted MySQL database using Railway
- Follows REST API best practices


