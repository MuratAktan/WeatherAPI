FROM openjdk:17-jdk-slim AS build

COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package

FROM openjdk:17-jdk-slim
WORKDIR weather
COPY --from=build target/*.jar weather-app.jar
ENTRYPOINT ["java", "-jar", "weather-app.jar"]