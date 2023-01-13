FROM amazoncorretto:ll-alpine-jdk
MAINTAINER Johana
COPY target/backend-0.0.1-SNAPSHOT.jar johana-app.jar
ENTRYPOINT ["java","-jar","/johana-app.jar"]
