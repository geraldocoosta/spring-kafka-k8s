FROM openjdk:17-jdk-slim
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app.jar"]