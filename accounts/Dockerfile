#Start with v=base image containing java runtime
FROM openjdk:17-jdk-slim

#Who maintains the image
MAINTAINER Sunith

#Add application jar to image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]