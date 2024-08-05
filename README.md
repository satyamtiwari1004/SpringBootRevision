# SpringBootRevision

This project is built using Spring Boot and PostgreSQL to practice and demonstrate various Spring Boot concepts. It covers a range of topics including IoC, dependency injection, microservices, and more. **I am still working on this project to enhance my skills and knowledge.**

## Table of Contents

1. [Introduction](#introduction)
2. [Technologies Used](#technologies-used)
3. [Spring Boot Concepts Practiced](#spring-boot-concepts-practiced)
   - [Spring Boot IOC](#spring-boot-ioc)
   - [Dependency Injection](#dependency-injection)
   - [Spring Cloud](#spring-cloud)
   - [Spring Security](#spring-security)
   - [Spring JPA](#spring-jpa)
   - [REST API](#rest-api)
   - [Swagger](#swagger)
   - [Microservice Architecture](#microservice-architecture)
   - [Spring MVC](#spring-mvc)
   - [Spring Logging](#spring-logging)
4. [Installation](#installation)
5. [Usage](#usage)
6. [Learning Resources](#learning-resources)
7. [Contributing](#contributing)
8. [License](#license)

## Introduction

This project aims to provide a hands-on experience with Spring Boot and its various features. It serves as a practice platform to understand and implement key concepts in building modern web applications.

## Technologies Used

- Spring Boot
- PostgreSQL
- Java
- Maven
- Spring Security
- Spring JPA
- Swagger
- Spring Cloud

## Spring Boot Concepts Practiced

### Spring Boot IOC
- **Inversion of Control**: Understanding how Spring manages the lifecycle of beans.
- **Bean Scopes**: Exploring singleton and prototype scopes.
- **Configuration Classes**: Using `@Configuration` to define bean configurations.

### Dependency Injection
- **Constructor Injection**: Using constructors for injecting dependencies.
- **Setter Injection**: Using setters for injecting dependencies.
- **Field Injection**: Using `@Autowired` for field injection.

### Spring Cloud
- **Service Discovery**: Implementing Eureka for service discovery.
- **Load Balancing**: Using Ribbon for client-side load balancing.
- **Config Server**: Managing configurations with Spring Cloud Config.

### Spring Security
- **Authentication**: Implementing user authentication and login functionality.
- **Authorization**: Configuring role-based access control.
- **JWT Tokens**: Using JSON Web Tokens for secure communication.

### Spring JPA
- **Repositories**: Creating repositories with Spring Data JPA.
- **Entity Relationships**: Managing one-to-one, one-to-many, and many-to-many relationships.
- **Custom Queries**: Writing custom queries with `@Query` annotation.

### REST API
- **Creating RESTful Services**: Building REST APIs for client-server communication.
- **Request Mapping**: Using `@RequestMapping` and `@GetMapping`, `@PostMapping`, etc.
- **Error Handling**: Implementing global exception handling with `@ControllerAdvice`.

### Swagger
- **API Documentation**: Integrating Swagger for documenting REST APIs.
- **Swagger UI**: Using Swagger UI for interactive API testing.
- **Customizing Documentation**: Customizing API documentation with annotations.

### Microservice Architecture
- **Microservices Communication**: Using Feign clients for communication between services.
- **Circuit Breaker**: Implementing circuit breaker patterns with Hystrix.
- **API Gateway**: Configuring an API Gateway for routing requests.

### Spring MVC
- **Model-View-Controller Pattern**: Structuring the application using the MVC pattern.
- **View Resolvers**: Configuring view resolvers for rendering views.
- **Form Handling**: Handling form submissions and validations.

### Spring Logging
- **Logging Frameworks**: Utilizing SLF4J and Logback for logging.
- **Log Configuration**: Configuring log levels and appenders.
- **Custom Logging**: Implementing custom logging for application events.

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/satyamtiwari1004/SpringBootRevision.git
    cd SpringBootRevision
    ```

2. Set up the PostgreSQL database and add the following properties to your `application.properties` file to connect to PostgreSQL:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
    ```

3. Build the project:
    ```bash
    mvn clean install
    ```

4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

## Usage

Access the application at `http://localhost:8080`. Use the Swagger UI to explore the API endpoints at `http://localhost:8080/swagger-ui.html`.

## Learning Resources

- [Spring Boot Official Documentation](https://spring.io/projects/spring-boot)
- [Spring Framework Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html)
- [Spring Security Reference](https://docs.spring.io/spring-security/site/docs/current/reference/html5/)
- [Spring Data JPA Reference](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference)
- [Microservices with Spring Cloud](https://spring.io/projects/spring-cloud)
- [RESTful API Design](https://www.restapitutorial.com/)
- [Swagger Documentation](https://swagger.io/docs/)

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add new feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Create a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](https://github.com/satyamtiwari1004/SpringBootRevision/blob/dev/LICENSE) file for details.