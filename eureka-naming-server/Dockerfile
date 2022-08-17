FROM openjdk:11
VOLUME /tmp
EXPOSE 8765
ADD target/*.jar app.jar

cannot unmute,ba
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]