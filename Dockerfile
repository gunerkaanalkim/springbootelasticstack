FROM adoptopenjdk/openjdk8:alpine-jre
VOLUME /tmp
EXPOSE 8080
COPY target/springbootelasticstack-0.0.1-SNAPSHOT.jar /home/app.jar
ENTRYPOINT ["java","-jar","/home/app.jar"]