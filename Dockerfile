FROM maven:3.8.1-openjdk-17-slim AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/Reservation-0.0.1-SNAPSHOT.jar Reservation.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","Reservation.jar"]