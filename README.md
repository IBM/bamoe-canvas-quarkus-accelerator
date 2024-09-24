# BAMOE Quarkus Full Accelerator 

This project has been auto-generated from the BAMOE Full Accelerator.
The Full Accelerator is for both decisions and workflows.
The project follows a template for the Apache Maven pom.xml, README (this file), LICENSE, logo, and application.properties files.
Make changes as appropriate.

A BAMOE project builds upon Quarkus, the Supersonic Subatomic Java Framework.
More information about Quarkus can be found at https://quarkus.io/.

## Running the application in dev mode

Dev mode enables a number of helpful features while developing the project.
These include:

- Incremental compilation
- Live Reload both in the browser and Java code
- Automatic test execution
- Testcontainer startup for infrastructure
- OpenAPI specifications
- DevUI resources (https://quarkus.io/guides/dev-ui)
- Others depending on project capabilities

You can run your application in dev mode as follows:

```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_** DevUI is available at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/code-with-quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Provided Code

The `src/main/resources/application.properties` file contains the basic properties for the project, enabling:

- CORS protection
- OpenAPI Specifications
- Swagger UI
- PostgreSQL setup

Add any additional code, BAMOE resource files, and/or properties to their appropriate places following Apache Maven's standard project layout.

