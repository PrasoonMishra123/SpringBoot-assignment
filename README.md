
Spring Boot JSON Manipulation Assignment
Overview
This project is a Spring Boot application designed to perform string manipulation within a predefined JSON model and expose a REST API to return the modified JSON model. It also saves the modified JSON model to an Oracle database.

Features
Manipulate JSON values based on user input.
Store and retrieve JSON models from an Oracle database.
Expose a REST API to interact with the application.
Prerequisites
JDK 11 or higher
Maven
Oracle Database
Postman or any API testing tool
Getting Started
Follow these steps to set up and run the application locally:

1. Clone the Repository
Clone the project repository from GitHub:

bash
Copy code
git clone https://github.com/yourusername/your-repository.git
cd your-repository
2. Configure the Application
Update the src/main/resources/application.properties file with your Oracle database credentials:

properties
Copy code
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.Oracle12cDialect
3. Build the Project
Use Maven to build the project:

bash
Copy code
mvn clean install
4. Run the Application
Run the Spring Boot application:

bash
Copy code
mvn spring-boot:run
5. Test the API
Use Postman or any other API client to test the API endpoint.

API Endpoint:

URL: http://localhost:8080/api/updateMenu
Method: POST
Query Parameter: input - A comma-separated list of key-value pairs separated by :::.
Example Request:

http
Copy code
POST /api/updateMenu?input="New:::NewDocument,Open:::OpenDocument"
Example Response:

json
Copy code
{
    "id": 1,
    "jsonmodel": {
        "menu": {
            "id": "file",
            "value": "File",
            "popup": {
                "menuitem": [
                    {"value": "NewDocument", "onclick": "CreateDoc()"},
                    {"value": "OpenDocument", "onclick": "OpenDoc()"},
                    {"value": "Save", "onclick": "SaveDoc()"}
                ]
            }
        }
    }
}
Project Structure
src/main/java/com.springbootassignment/controller/: Contains REST controllers.
src/main/java/com.springbootassignment/entity/: Contains JPA entity classes.
src/main/java/com.springbootassignment/repository/: Contains Spring Data JPA repositories.
src/main/java/com.springbootassignment/service/: Contains service classes for business logic.
src/main/java/com.springbootassignment/dto/: Contains DTO classes for API responses.
src/main/resources/application.properties: Configuration file for database and other properties.

Testing
Unit Tests
Test the string manipulation logic.
Test service methods to ensure correct data processing.
Integration Tests
Test the API endpoints to verify the entire flow from input to response.
Contributing
If you would like to contribute to this project, please follow these steps:

License

This project is licensed under the MIT License. See the LICENSE file for details.

Acknowledgements

Spring Boot Documentation
Oracle JDBC Driver
