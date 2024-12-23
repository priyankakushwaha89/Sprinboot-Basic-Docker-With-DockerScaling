FROM openjdk:17

COPY target/Dockertest.jar testimage.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","testimage.jar"]