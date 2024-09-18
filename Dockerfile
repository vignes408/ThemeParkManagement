FROM openjdk:18
WORKDIR /app
COPY ./target/ThemePark-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "ThemePark-0.0.1-SNAPSHOT.jar"]
