# Use an official JDK image
FROM openjdk:17

# Set the working directory
WORKDIR /app

# Copy the built JAR file into the container
COPY target/*.jar app.jar

# Expose the port used by Spring Boot (change if needed)
EXPOSE 8080

# Start the application
CMD ["java", "-jar", "app.jar"]