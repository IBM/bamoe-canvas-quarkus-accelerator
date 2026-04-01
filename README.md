# IBM Business Automation Manager Open Editions :: Accelerators

Accelerators are project templates that can be applied to existing folders containing Workflows (BPMN), Decisions (DMN), and Rules (DRL), transforming them into complete Business Service projects that can be built, tested, executed, and deployed.

This repository hosts multiple Accelerators for Quarkus and Spring Boot-based projects, supporting both Maven and Gradle build tools.

> Each Accelerator is stored in its own branch, following the `{version}-{name}-{framework}-{build-tool}` pattern. E.g., `9.4.0-ibm-0006-workflows-quarkus-maven`, or `9.4.0-ibm-0006-decisions-spring-boot-gradle`.

> The `main` branch of this repository is not used for development and does not host any Accelerators.

## Decisions

Decisions and Rules capabilities, including Test Scenario (SCESIM) support for enabling Decisions and Rules unit testing.

- `{version}-decisions-quarkus-maven`
- `{version}-decisions-quarkus-gradle`
- `{version}-decisions-spring-boot-maven`
- `{version}-decisions-spring-boot-gradle`

## Workflows

Workflow, Decisions, and Rules capabilities, including Data-Index, Jobs Service, Data Audit, User Tasks, Process Instances Migration, and Runtimes persistence subsystems.

Also features the BAMOE Quarkus Dev UI / Spring Boot Web Console for an enhanced development experience.

- `{version}-workflows-quarkus-maven`
- `{version}-workflows-quarkus-gradle`
- `{version}-workflows-spring-boot-maven`
- `{version}-workflows-spring-boot-gradle`

---

For more information about BAMOE, see: https://www.ibm.com/products/business-automation-manager-open-editions

For BAMOE's documentation, visit: https://www.ibm.com/docs/ibamoe
