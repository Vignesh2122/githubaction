# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Compile the Java source file
RUN javac com/example/Calculator.java

# Run the Calculator class
CMD ["java", "com.example.Calculator"]
