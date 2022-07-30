FROM openjdk:8-jdk-alpine
WORKDIR /app
EXPOSE 8080
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY src ./src
CMD ["./mvnw", "spring-boot:run"]