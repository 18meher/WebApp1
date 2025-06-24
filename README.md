# WebApp1
Java Spring boot rest api.


# Web Application with Spring Boot

A secure web application built with Spring Boot that provides user authentication and basic web pages.

## Features

- User authentication (Sign up and Login)
- Secure password storage
- Responsive web interface
- RESTful API endpoints
- Static resource serving (HTML, CSS, JavaScript)

## Technologies Used

- Java 21
- Spring Boot 3.x
- Maven (for dependency management)
- HTML5, CSS3, JavaScript (for frontend)

## Prerequisites

- Java Development Kit (JDK) 17 or later
- Maven 3.6.3 or later
- Git (for version control)

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/18meher/WebApp1.git
cd WebApp1
```

### 2. Build the Application

```bash
mvn clean install
```

### 3. Run the Application

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080/myapp`

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/training/demo_app/
│   │       ├── AuthController.java    # Handles authentication endpoints
│   │       └── PageController.java    # Handles page routing
│   └── resources/
│       ├── static/                    # Static resources (JS, CSS, images)
│       │   ├── main.js
│       │   ├── style.css
│       │   ├── welcome.html
│       │   └── signup.html
│       └── application.properties     # Application configuration
```

## API Endpoints

- `POST /signup` - Register a new user
- `POST /login` - Authenticate a user
- `GET /all` - Get all users
