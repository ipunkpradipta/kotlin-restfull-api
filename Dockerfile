FROM openjdk:8-alpine

COPY build/libs/kotlin-restfull-api-new-0.0.1-SNAPSHOT.jar /app/application.jar

CMD ["java","-jar","/app/application.jar"]