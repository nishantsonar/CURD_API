FROM openjdk:18
WORKDIR /app
COPY ./target/CURD_API-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "CURD_API-0.0.1-SNAPSHOT.jar"]