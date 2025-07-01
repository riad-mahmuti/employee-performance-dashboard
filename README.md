
# Employee Performance Dashboard

A Spring Boot REST API for managing employee records and tracking performance.

## Features

- Create, Read, Delete Employees
- Store performance scores
- PostgreSQL backend
- JPA + Spring Boot
- Unit tested with JUnit + Mockito

## Setup Instructions

1. Configure your PostgreSQL database in `application.properties`
2. Build and run:

```bash
./mvnw spring-boot:run
```

3. Access API via:
- `GET /api/employees`
- `POST /api/employees`
- `DELETE /api/employees/{id}`

## Tech Stack

- Java 17
- Spring Boot 3
- PostgreSQL
- JPA/Hibernate
- Maven
