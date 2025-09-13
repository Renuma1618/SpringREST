FROM openjdk:17
ADD target/app.jar app.jar
EXPOSE 8880
ENTRYPOINT ["java","-jar","app.jar"]