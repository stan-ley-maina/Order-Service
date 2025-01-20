FROM openjdk:17-jdk-alpine

# Set the working directory inside the container


WORKDIR /opt


# Copy the wait-for-it script to the container



# Copy the JAR file from the host's target directory to the container at /opt/app.jar
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Set the ENTRYPOINT to run the application after waiting for MySQL to be ready
ENTRYPOINT [ "java", "-jar", "/opt/app.jar"]




