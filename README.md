<!--
  IBM Confidential
  PID 5900-AR4
  Copyright IBM Corp. 2026
-->

# `<Your project's title>`

> _This project was auto-generated from the BAMOE Canvas Accelerator `Spring Boot (DMN)`, and enables Decisions and Rules. It's built on [Spring Boot](https://spring.io/), the Java-based framework for building standalone production-ready Spring applications._
>
> **NOTE**: Some properties configured in `src/main/resources/application.properties` have to be updated replacing the `<TODO>` placeholder with actual values for your usage.

# Description

`<Your project's description>`

# Building and running

### In dev mode

```shell script
./gradlew bootRun
```

After a successful start, the Business Service will be available at http://:0.0.0.0:8080 address (IP depends on `application.properties` configuration).

The Swagger UI page (http://0.0.0.0:8080/swagger-ui/index.html) shows all the generated endpoints, providing a way to quickly verify them.

### Package and Run

```sh
./gradlew clean build
```

or

```sh
./gradlew clean bootJar
```

### Configuring CORS

By default, this Business Service accepts requests from all origins (`*`). This is configured via the `bamoe.cors.allowed-origin-patterns` property.

**IMPORTANT**: Change this configuration before deploying to production to allow only trusted origins.

You can configure allowed CORS origins in two ways:

1. **Via `application.properties`**:

   ```properties
   # Single origin
   bamoe.cors.allowed-origin-patterns=https://example.com

   # Multiple origins (comma-separated)
   bamoe.cors.allowed-origin-patterns=https://example.com,https://another.com

   # Pattern with wildcard
   bamoe.cors.allowed-origin-patterns=https://*.example.com
   ```

2. **Via environment variable**:
   ```bash
   export BAMOE_CORS_ALLOWED_ORIGIN_PATTERNS=https://example.com,https://another.com
   ```

---

### _Notes on provided code and how to evolve this Business Service_

> The `src/main/resources/application.properties` file contains the basic properties for the project, enabling:
>
> - CORS protection
> - OpenAPI Specifications
> - Swagger UI
> - Secured endpoints with OIDC
>
> Add any additional code, BAMOE resource files, and/or properties to their appropriate places following Gradle's standard project layout:
>
> - `src/main/java/`
>   - For Java production code.
> - `src/main/resources/`
>   - For production configuration files and Decisions (`.dmn`), Rules (`.drl`), Excel Decision Tables (`.xslx`), and others.
> - `src/test/java/`
>   - For Java test code.
> - `src/test/resources/`
>   - For test configuration files.
> - `src/integratonTest/java/`
>   - For Java integraton test code.
> - `src/integratonTest/resources/`
>   - For integraton test configuration files.
>
> For more information about BAMOE, please refer to [the official BAMOE Documentation](https://www.ibm.com/docs/en/ibamoe).
