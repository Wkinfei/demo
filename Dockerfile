# FROM maven:3.8.7-openjdk-18-slim AS build 
# WORKDIR /home/app 
 
# COPY ./pom.xml /home/app/pom.xml 
# COPY ./src/test/java/testtest/demo/DemoApplicationTests.java \ 
#     src/test/java/testtest/demo/DemoApplicationTests.java 
 
# RUN mvn -f /home/app/pom.xml clean package 
 
# COPY . /home/app 
# RUN mvn -f /home/app/pom.xml clean package 
 
# FROM openjdk:18.0-slim 
# EXPOSE 8090 
# COPY --from=build /home/app/target/*.jar app.jar 
# ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]


FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]