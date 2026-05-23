# Deploying to Kubernetes/OpenShift

The `.bamoe/dev-deployments` folder contains deployment configurations for running this application on Kubernetes or OpenShift clusters directly from the Canvas.

## Available Deployment Options

- **kubernetes** - Deploy to standard Kubernetes clusters using Ingress
- **openshift** - Deploy to OpenShift clusters using Routes

## Key Features

- One-click deployment from the Canvas
- Optional DMN Form Webapp sidecar for interactive testing of decision models
- Configurable dev mode startup commands
- Automatic health checks and readiness probes

## Prerequisitess

- Connected Kubernetes or OpenShift cluster
- Appropriate RBAC permissions for creating Deployments, Services, and Ingress/Routes

## Deployment Configuration

The `dev-deployments` folder contains:

- **manifests/** - Base Kubernetes/OpenShift resource definitions (Deployment, Service, Ingress/Route)
- **patches/** - RFC6902-compliant JSON patches for customizing deployments
- **option.json** - Deployment option metadata and parameter definitions

## Customization

You can customize the deployment by modifying:

- **Container Image** - Change the base image used for deployment
- **Container Port** - Adjust the port exposed by your application
- **Command** - Modify the startup command for your framework (Quarkus or Spring Boot)

All customizations can be made through the BAMOE Canvas UI when deploying your application.
