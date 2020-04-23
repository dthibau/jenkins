FROM openjdk:8-jre-alpine
MAINTAINER David THIBAU <david.thibau@gmail.com>

ADD ./target/notifcation-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/notifcation-service.jar"]

EXPOSE 4444
