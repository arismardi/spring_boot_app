FROM sgrio/java:jdk_8_ubuntu
VOLUME /tmp
EXPOSE 8080
ARG jar=target/myapp-0.0.1-SNAPSHOT.jar
ADD $jar app.jar
ENV JAVA_OPTS $JAVA_OPTS "-Xms2048m -Xmx4096m"
ENV JAVA_OPTS $JAVA_OPTS "-Dserver.port=8080"
ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar