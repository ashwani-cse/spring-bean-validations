# Spring Bean Validation App

This project is a Spring Boot application that demonstrates the use of bean validation in a RESTful API. It includes a simple controller, an exception handler, and a model representing a shopping cart.

## Project Overview

### Technologies Used
- Java 17
- [Spring Boot](https://spring.io/projects/spring-boot) 3.2.1
- [Maven](https://maven.apache.org/)

### Dependencies
- **spring-boot-starter-web:** Spring Boot starter for building web applications.
- **spring-boot-starter-validation:** Starter for using Bean Validation with Hibernate Validator. (It is required to add)
- **spring-boot-devtools:** Developer tools for automatic application restarts.
- **spring-boot-configuration-processor:** Configuration metadata annotation processor.
- **lombok:** Java library to simplify code by providing annotations.
- **spring-boot-starter-test:** Starter for testing Spring Boot applications.
- **spring-boot-starter-actuator:** Starter for exposing endpoints for monitoring and managing your application.

## Controller

### CartController

This controller handles operations related to a shopping cart. It includes an endpoint for creating a cart and validating the input using Bean Validation annotations. Additionally, it demonstrates the usage of request headers, specifically the "affiliate" header.

**Endpoint:**
- `POST /cart/`: Creates a cart using JSON request body and validates the input. Expects a "affiliate" header with a pattern constraint.
- Valid Payload: <br/>
```
{
    "storeId": 1,
    "amount": 90000,
    "quantity": 1,
    "cartPromotions": [
        "promo1",
        "promo2"
    ],
    "cartMenuItems": [
        {
            "baseProductId": "123",
            "name": "cart item1"
        }
    ]
}
```
### LoginController

This controller demonstrates method-level parameter validations for user login.

**Endpoint:**

- `GET /login`: Validates the "username" parameter using `@NotBlank` and returns a response.

## Exception Handling

The `ExceptionHandlerAdvice` class provides handling for various validation-related exceptions:

- `MissingRequestHeaderException`: Handles missing request headers.
- `HandlerMethodValidationException`: Handles pattern validation failures.
- `MethodArgumentNotValidException`: Handles Jakarta validations like `@NotNull`, `@NotEmpty` failures on any field of the `Cart` model.

## Models

### Cart

Represents a shopping cart with validation annotations on its fields.

### CartMenuItem

Represents an item within the shopping cart with validation annotations on its fields.

## Usage

1. Clone the repository:

    ```bash
    git clone https://github.com/ashwani-cse/spring-bean-validations.git
    ```

2. Build the project:

    ```bash
    mvn clean install
    ```

3. Run the application:

    ```bash
    mvn spring-boot:run
    ```

4. Access the API:

   Open a web browser or a tool like [Postman](https://www.postman.com/) and make a GET request to `http://localhost:8080/{cartId}`. Ensure to provide the `affiliate` header with a valid value.

## Important Notes-
### @Valid: 
##### When you use @Valid on a method parameter or a field in a class, it indicates that the parameter or the object should be validated against the constraints specified in its associated bean validation annotations (e.g., @NotNull, @Size, etc.).
- `@Valid` annotation is useful when you have nested objects or collections that need validation.
-  Suppose `Cart` having `Menu` then we can use `@Valid` on that specific filed or Controller method like `@Valid @RequestBody Cart cart`
- In this case, for header field affiliate `@Pattern` is sufficient no need to use `@Valid` annotation.
- `@Valid` is required if we have used any validation like `@NotNull`, `@NotBlank` etc. They will not work until we use `@Valid` while referencing Class anywhere.

## Social Profile  
- [LinkedIn](https://www.linkedin.com/in/ashwanicse/)
- [Leetcode](https://leetcode.com/ashwani__kumar/)
- [Topmate](https://topmate.io/ashwanikumar)
## Linkedin Newsletter
- [Subscribe](https://www.linkedin.com/newsletters/7084124970443767808/)
  