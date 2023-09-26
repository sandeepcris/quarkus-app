FROM openjdk:17-jdk-slim-buster
COPY target/*.jar /opt/java/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/opt/java/app.jar"]