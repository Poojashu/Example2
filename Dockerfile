FROM openjdk:8
ADD target/Docker1-0.0.1-SNAPSHOT.jar Docker1-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","Docker1-0.0.1-SNAPSHOT.jar"]