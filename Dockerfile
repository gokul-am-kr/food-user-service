FROM openjdk:11-jre-slim
ARG JAR_FILE=build/libs/ticket-0.1.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
