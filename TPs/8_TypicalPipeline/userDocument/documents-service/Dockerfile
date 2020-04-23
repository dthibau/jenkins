FROM openjdk:8-jre-alpine
MAINTAINER David THIBAU <david.thibau@gmail.com>

ADD ./target/documentService.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/documentService.jar"]

EXPOSE 3333
