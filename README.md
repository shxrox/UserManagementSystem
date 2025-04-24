# User Management System

A simple Spring Boot application for managing users with JWT-based authentication.

## Features

- User registration and login
- JWT authentication and token refresh
- View user profile (authenticated)
- Admin:
  - View all users
  - View single user by ID
  - Update user
  - Delete user

## Tech Stack

- Java Spring Boot
- Spring Security
- JWT (jjwt)
- H2/MySQL Database
- Lombok

## How to Run

1. Clone the project
2. Open in IntelliJ or your favorite IDE
3. Run `UserManagementSystemApplication.java`
4. Use tools like Postman to test the endpoints

## Endpoints

### Auth
- `POST /auth/register`
- `POST /auth/login`
- `POST /auth/refresh`

### Admin
- `GET /admin/get-all-users`
- `GET /admin/get-users/{userId}`
- `PUT /admin/update/{userId}`
- `DELETE /admin/delete/{userId}`

### Authenticated User
- `GET /adminuser/get-profile`
