FROM maven:3.8.2-jdk-11 AS build
COPY . .
RUN mvn clean package -Pprod -DskipTests


FROM openjdk:11-jdk-slim
COPY --from=build /target/DogManagementSystemm-0.0.1-SNAPSHOT.jar DogManagementSystemm.jar
CMD ["java", "-jar", "DogManagementSystemm.jar"]