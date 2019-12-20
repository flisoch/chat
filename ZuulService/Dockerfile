
FROM openjdk:8-jdk-alpine
#ADD target/zuul-0.1.jar zuul-0.1.jar
#RUN mvn clean install
COPY target/zuul-0.0.1-SNAPSHOT.jar zuul-0.1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "zuul-0.1.jar"]
