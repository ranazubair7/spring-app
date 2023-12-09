FROM openjdk:11

RUN apt-get update -y

RUN apt-get install -y maven

WORKDIR /app

RUN mvn clean install

COPY target/spring-app-0.0.1-SNAPSHOT.jar /app/

CMD ["java", "-jar", "spring-app-0.0.1-SNAPSHOT"] 
