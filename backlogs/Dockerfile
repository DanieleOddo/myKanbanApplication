FROM adoptopenjdk/openjdk11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} backloogs.jar
ENTRYPOINT ["java","-jar","/backloogs.jar"]