# Stage 1: Build the app using Maven
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app

# Copy project files
COPY Quiz-app /app/Quiz-app

# Build the application
RUN mvn -f Quiz-app/pom.xml clean package -DskipTests

# Stage 2: Run the app using a smaller JRE image
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy the built jar from stage 1
COPY --from=build /app/Quiz-app/target/*.jar app.jar

# Expose the port your app runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
