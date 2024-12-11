# Build stage
FROM gradle:6.9-jdk11 AS BUILD_STAGE

# Create an application directory
RUN mkdir -p /app

# The /app directory should act as the main application directory
WORKDIR /app

# Copy our project directory (locally) in the current directory of our docker image (/app)
COPY . . 

# Start the build process
RUN gradle build

# Package stage
# That is why we tell node here to use the openjdk image with java 11 as base.
FROM openjdk:11.0.13

# Create an application directory
RUN mkdir -p /app

# The /app directory should act as the main application directory
WORKDIR /app

# Copy from previous build step to the current docker image
COPY --from=BUILD_STAGE /app/build/libs/*.jar ./app.jar

# Expose $PORT on container.
# We use a varibale here as the port is something that can differ on the environment.
EXPOSE $PORT

# Start the app
CMD [ "java", "-jar", "./app.jar" ]
