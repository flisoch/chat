
#FROM java:8
FROM openjdk:8-jdk-alpine
COPY target/cat-1.0-SNAPSHOT.jar cat-1.0.jar
ENTRYPOINT ["java", "-jar", "cat-1.0.jar"]
