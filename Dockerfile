FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 9000
ADD target/*.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [curl http://localhost:9002 "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]