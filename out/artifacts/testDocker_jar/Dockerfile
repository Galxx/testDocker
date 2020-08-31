# we will use openjdk 8 with alpine as it is a very small linux distro
FROM alpine 

RUN apk add openjdk8
ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
ENV PATH $PATH:$JAVA_HOME/bin

 
WORKDIR /root/testDocker
COPY testDocker.jar /root/testDocker
 
# set the startup command to execute the jar
CMD ["java", "-jar", "/root/testDocker/testDocker.jar"]
