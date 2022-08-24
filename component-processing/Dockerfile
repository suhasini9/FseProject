FROM openjdk:11
VOLUME /tmp
EXPOSE 8765
ADD target/*.jar app.jar

cannot unmute,ba
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]



docker run --env MYSQL_ROOT_PASSWORD=root --env MYSQL_DATABASE=mydb --env MYSQL_USER=bhavik --env MYSQL_PASSWORD=bhavik123  -p 3306:3306 --detach mysql:5.7