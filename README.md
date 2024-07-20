# Spring Boot String Manipulation API

## Overview

This project is a Spring Boot application that manipulates a predefined JSON model based on dynamically fed inputs and saves the modified JSON model to an Oracle database.

## Requirements

- Java 11+
- Maven
- Oracle Database

## Setup

1. Clone the repository
2. Configure the Oracle database connection in `application.properties`:
    ```properties
    spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    ```
3. Build and run the application:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

## API Endpoints

- `POST /api/updateMenu`: Takes an input string in the format `"key1:::value1,key2:::value2"` and updates the JSON model.

## Example

Request:
```http
POST /api/updateMenu?input="New:::NewDocument,Open:::OpenDocument"
