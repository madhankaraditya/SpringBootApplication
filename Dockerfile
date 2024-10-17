# Use a base image with OpenJDK 21
FROM eclipse-temurin:21-jre

# Set the working directory
WORKDIR /app

# Copy the built JAR file into the container
COPY target/SpringBoot-Java-Docker-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port (adjust if needed)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
