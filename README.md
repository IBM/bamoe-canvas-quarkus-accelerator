# `<Your project's title>`

> _This project was auto-generated from the BAMOE Canvas Accelerator `Spring Boot (DMN)`, and enables Decisions and Rules. It's built on [Spring Boot](https://spring.io/), the Java-based framework for building standalone production-ready Spring applications.._
>
> **NOTE**: Some properties configured in `src/main/resources/application.properties` have to be updated replacing the `<TODO>` placeholder with actual values for your usage.

# Description

`<Your project's description>`


# Building and running

### Prerequisites

You will need:
- Java 17+ installed
- Environment variable JAVA_HOME set accordingly
- Maven 3.9.6+ installed

### In dev mode

```shell script
mvn clean compile spring-boot:run
```

After a successful start, the application will be available at http://:0.0.0.0:8080 address (IP depends on application.properties configuration).

The Swagger UI page (http://0.0.0.0:8080/swagger-ui/index.html) shows all the generated endpoints, providing a way to quickly verify them.

### Hot-reload in dev-mode
For medium to large sized applications, recompiling and restarting the application upon code changes could be cumbersome and time-consuming. To simplify that, the Spring Boot framework offers devtools.

The condition is that the classpath has to be "manually" rebuilt to trigger the reload.

Since Business Services also relies on automatic code-generation driven by models and executed by the 'kogito-maven-plugin', the approach is to:

Create a mvn clean compile command/button (details vary by IDE) to be fired on-demand.

Start the application with:
```shell script
mvn clean compile spring-boot:run.
```
Execute the command at point 1 when it is required to reload changes.

### As a native executable

```shell script
mvn clean package -Dnative
```

### Package and Run

```sh
mvn clean package
java -jar ./target/your-application-name.jar
```

---

### _Notes on provided code and how to evolve this application_
 
> The `src/main/resources/application.properties` file contains the basic properties for the project, enabling:
> 
> - CORS protection
> - OpenAPI Specifications
> - Swagger UI
> - Secured endpoints with OIDC
> 
> Add any additional code, BAMOE resource files, and/or properties to their appropriate places following Apache Maven's standard project layout:
> - `src/main/java/`
>   - For Java production code.
> - `src/main/resources/`
>   - For production configuration files and Decisions (`.dmn`), Rules (`.drl`), Excel Decision Tables (`.xslx`), and others.
> - `src/test/java/`
>   - For Java test code.
> - `src/test/resources/`
>   - For test configuration files.
> 
> For more information about BAMOE, please refer to [the official BAMOE Documentation](https://www.ibm.com/docs/en/ibamoe).
