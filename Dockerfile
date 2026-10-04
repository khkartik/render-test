FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 2300

ENTRYPOINT ["java", "-jar", "app.jar"]