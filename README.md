# 🧮 Scientific Calculator Project - DevOps Pipeline

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://www.oracle.com/java/) 
[![Maven](https://img.shields.io/badge/Maven-3.8.1-orange.svg)](https://maven.apache.org/)
[![Jenkins](https://img.shields.io/badge/Jenkins-CI%2FCD-red.svg)](https://jenkins.io/)
[![Docker](https://img.shields.io/badge/Docker-Container-blue.svg)](https://www.docker.com/)
[![Ansible](https://img.shields.io/badge/Ansible-Deployment-yellow.svg)](https://www.ansible.com/)

---

## 📝 Overview

The **Scientific Calculator** project demonstrates the implementation of a complete DevOps pipeline. The project is a Java-based scientific calculator application with functions like square root, factorial, logarithms, and more. This pipeline automates the build, testing, containerization, and deployment processes using modern DevOps tools.

## 🔧 Tools and Technologies

- **[GitHub](https://github.com/)**: Source control management for version tracking and collaboration.
- **[Maven](https://maven.apache.org/)**: Build automation for compiling the Java project and managing dependencies.
- **[Jenkins](https://www.jenkins.io/)**: Continuous integration (CI) and automation of the build pipeline.
- **[Docker](https://www.docker.com/)**: Containerization of the application for consistent runtime environments.
- **[Ansible](https://www.ansible.com/)**: Configuration management and automation of deployment.
- **[Ngrok](https://ngrok.com/)**: Secure tunneling to expose the locally hosted application for external access.

---

## ⚙️ Project Workflow

The project follows a streamlined DevOps workflow:

1. **Development**: The scientific calculator is developed using Java.
2. **Version Control**: The code is committed and pushed to a GitHub repository.
3. **Build and Testing**: Jenkins automatically pulls the latest code and runs a build using Maven.
4. **Containerization**: Docker is used to package the application into a consistent environment.
5. **Deployment**: Ansible automates the deployment of the Docker container.
6. **Exposure**: Ngrok exposes the locally running container for external access.

---

## 🚀 DevOps Pipeline Breakdown

### 1. **GitHub** (Version Control)
GitHub is used to store the code and track changes. It allows multiple collaborators to contribute and keeps a complete history of all modifications. The repository for this project is structured to follow best practices, with regular commits ensuring that changes are properly versioned.

### 2. **Maven** (Build Automation)
Maven handles the compilation of the Java source code and the management of dependencies. It is also responsible for packaging the application into a `.jar` file that can later be containerized using Docker.

### 3. **Jenkins** (Continuous Integration)
Jenkins automates the build and testing process, ensuring continuous integration. The pipeline includes the following stages:
   - **Checkout**: Jenkins pulls the latest code from GitHub.
   - **Build**: Maven compiles the code and runs tests.
   - **Docker Build**: The Jenkins pipeline triggers a Docker build to package the application.
   - **Push to Docker Hub**: The Docker image is automatically pushed to Docker Hub for distribution.

### 4. **Docker** (Containerization)
Docker is used to containerize the Java application, ensuring consistent runtime environments. The application, along with its dependencies, is bundled into a Docker image, allowing it to run anywhere, independent of the host operating system.

### 5. **Ansible** (Deployment)
Ansible automates the deployment of the Docker container to the production or testing environment. This ensures that the application can be deployed quickly, consistently, and without manual intervention.

### 6. **Ngrok** (Expose Locally Hosted App)
Ngrok is used to expose the locally running Docker container to the internet. This enables real-time feedback and allows external users to access the application without deploying it to a remote server.

---

## 📂 Repository Structure

```plaintext
ScientificCalculator/
├── Deployment/
│   ├── deploy.yml      # Ansible playbook for deployment
│   ├── inventory       # Defines the localhost user
├── src/
│   ├── main/
│   │   └── java/
│   │       └── spe/
│   │            └── Main.java  # Conatains the Calculator logic
│   └── test/
│   │   └── java/
│   │       └── ScientificCalculatorTest.java   # Contains the JUnit code for testing
├── target/
│       └── Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar   # jar file to be executed in the docker conatiner
├── pom.xml              # Maven configuration file
├── Dockerfile           # Docker configuration file
├── Jenkinsfile          # Jenkins pipeline configuration 
└── README.md            # Project documentation
