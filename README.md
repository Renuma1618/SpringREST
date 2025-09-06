# Spring REST 

 Spring Boot REST API  to demonstrate basic REST concepts.

## Features

- **Get all students**: Returns a list of students.
- **Get student by ID**: Retrieve a specific student using `@PathVariable`.
- **Filter students**: Use query parameters with `@RequestParam` to filter the student list.

## Annotations Used

- `@RestController` – Marks the class as a REST controller where every method returns a domain object instead of a view. Combines `@Controller` and `@ResponseBody`.
- `@GetMapping` – Maps HTTP GET requests to specific handler methods. Used to retrieve data.
- `@RequestParam` – Binds query parameters from the URL to method parameters. Useful for filtering or optional inputs.
- `@PathVariable` – Binds URL path variables to method parameters. Useful for identifying a resource by its ID.


## Technologies Used

- Java
- Spring Boot
- Maven
- ArrayList for in memory data storage

