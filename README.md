# springboot-basic-application

A basic Spring Boot application with Docker integration and Docker Compose for scaling.

## Features
- Spring Boot application with a `web` dependency.
- Dockerized for easy containerization.
- Supports Docker Compose for container scaling.

---

## Prerequisites

Ensure you have the following installed:
1. [Java 17](https://jdk.java.net/17/)
2. [Maven](https://maven.apache.org/)
3. [Docker](https://www.docker.com/)
4. [Docker Compose](https://docs.docker.com/compose/)

---

## Project Structure

```plaintext
springboot-basic-application/
├── src/ (source code)
├── target/ (built application)
├── Dockerfile
├── docker-compose.yml
└── README.md
```

---

## Getting Started

### 1. Clone the repository:
```bash
git clone https://github.com/priyankakushwaha89/Sprinboot-Basic-Docker-With-DockerScaling.git
cd Sprinboot-Basic-Docker-With-DockerScaling
```

### 2. Build the project:
Ensure Maven is installed. Run:
```bash
mvn clean package
```

This will generate a JAR file in the `target/` directory.

### 3. Build the Docker image:
Ensure Docker is installed and running. Run:
```bash
docker build -t springboot-basic-application .
```

### 4. Run the application in a container:
```bash
docker run -p 8080:8080 springboot-basic-application
```

The application will be accessible at `http://localhost:8080`.

---

## Scaling with Docker Compose

The provided `docker-compose.yml` enables scaling the application.

### Steps:
1. Build the Docker images:
   ```bash
   docker-compose build
   ```
2. Start containers using Docker Compose:
   ```bash
   docker-compose up --scale testimage=3
   ```

This will start 3 instances of the service, each mapped to a random port in the range `1000-1200` on the host machine.

---

## Configuration Files

### `Dockerfile`
```dockerfile
FROM openjdk:17

COPY target/Dockertest.jar testimage.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "testimage.jar"]
```

### `docker-compose.yml`
```yaml
version: "3"
services:
  testimage:
    build: .
    ports:
      - 1000-1200:8080
```

---
