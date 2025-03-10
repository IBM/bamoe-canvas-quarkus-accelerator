# `<Your project's title>`

> _This project was auto-generated from the BAMOE Canvas Accelerator `Quarkus (Full)`, and enables Processes, Decisions, and Rules. It's built on [Quarkus](https://quarkus.io/), the Supersonic Subatomic Java Framework._
>
> **NOTE**: Some properties configured in `src/main/resources/application.properties` have to be updated replacing the `<TODO>` placeholder with actual values for your usage.

# Description

`<Your project's description>`

# Building and running

### In dev mode

```shell script
mvn clean quarkus:dev
```

Dev mode enables a number of helpful features while developing the project:

- Incremental compilation
- Live-reloading both in the browser and for Java code
- Automatic test execution
- OpenAPI specifications for HTTP endpoints
- [Dev UI](https://quarkus.io/guides/dev-ui) resources, including a [Dev UI dedicated for Processes @ localhost:8080](http://localhost:8080/q/dev-ui/org.jbpm.jbpm-quarkus-devui/process-instances).

### As a JAR

```shell script
mvn clean package
```

This command produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
mvn clean package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

### As a native executable

```shell script
mvn clean package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
mvn clean package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/*-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

---

### _Notes on provided code and how to evolve this application_
 
> The `src/main/resources/application.properties` file contains the basic properties for the project, enabling:
> 
> - CORS protection
> - OpenAPI Specifications
> - Swagger UI
> - PostgreSQL setup
> - Secured endpoints with OIDC
> - Secured connections with BAMOE Management Console
> 
> Add any additional code, BAMOE resource files, and/or properties to their appropriate places following Apache Maven's standard project layout:
> - `src/main/java/`
>   - For Java production code.
> - `src/main/resources/`
>   - For production configuration files and Decisions (`.dmn`), Processes (`.bpmn`), Rules (`.drl`), Excel Decision Tables (`.xslx`), and others.
> - `src/test/java/`
>   - For Java test code.
> - `src/test/resources/`
>   - For test configuration files.
> 
> For more information about BAMOE, please refer to [the official BAMOE Documentation](https://www.ibm.com/docs/en/ibamoe).
