FROM java:8-jre-alpine
MAINTAINER Shukri Shukriev

ADD @project.build.finalName@.jar app.jar

RUN sh -c 'touch /app.jar'
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=docker", "-jar", "/app.jar"]
