<!-- Copyright IBM Corp. 2025. -->

# `<Your project's title>`

> _This project was auto-generated from the BAMOE Canvas Accelerator `Spring Boot (Full)`, and enables Decision, Rules, and Workflows. It's built on [Spring Boot](https://spring.io/), the Java-based framework for building standalone production-ready Spring applications._
>
> **NOTE**: Some properties configured in `src/main/resources/application.properties` have to be updated replacing the `<TODO>` placeholder with actual values for your usage.

# Description

`<Your project's description>`

# Building and running

### In dev mode

```shell script
mvn clean compile spring-boot:run -Pdevelopment
```

After a successful start, the application will be available at http://:0.0.0.0:8080 address (IP depends on application.properties configuration).

The Swagger UI page (http://0.0.0.0:8080/swagger-ui/index.html) shows all the generated endpoints, providing a way to quickly verify them.

### Package and Run

```sh
mvn clean package
java -jar ./target/your-application-name.jar
```

### Enabling security

To enable security for this application follow these steps, in the `application.properties`:

- Set `kogito.auth.enabled` to `true`;
- Remove the `spring.autoconfigure.exclude` property (this will enable the `BamoeSpringBootWebSecurityConfig` class to be automatically loaded);
- Set `spring.security.oauth2.resourceserver.jwt.issuer-uri` to your Identity Provider URL.

### Using the BAMOE Gen AI Task

This project comes bundled with the `com.ibm.bamoe:bamoe-gen-ai-task-work-item-handler-spring-boot` addon, and if your workflow uses the BAMOE Gen AI Task, you will need to configure the required AI Providers.

Set the following properties in the `application.properties` file to configure each AI Provider.

```properties
# watsonx
bamoe.workflow.gen-ai-task.provider.watsonx.base-url=<WATSONX_BASE_URL>
bamoe.workflow.gen-ai-task.provider.watsonx.api-key=<API_KEY>
bamoe.workflow.gen-ai-task.provider.watsonx.project-id=<PROJECT_KEY>
bamoe.workflow.gen-ai-task.provider.watsonx.log-requests=<true/false>
bamoe.workflow.gen-ai-task.provider.watsonx.log-responses=<true/false>

# Ollama
bamoe.workflow.gen-ai-task.provider.ollama.base-url=<OLLAMA_BASE_URL> # Usually http://localhost:11434
bamoe.workflow.gen-ai-task.provider.ollama.log-requests=<true/false>
bamoe.workflow.gen-ai-task.provider.ollama.log-responses=<true/false>

# OpenAI
bamoe.workflow.gen-ai-task.provider.openai.base-url=<OPENAI_BASE_URL>
bamoe.workflow.gen-ai-task.provider.openai.api-key=<API_KEY>
bamoe.workflow.gen-ai-task.provider.openai.log-requests=<true/false>
bamoe.workflow.gen-ai-task.provider.openai.log-responses=<true/false>
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
>
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
