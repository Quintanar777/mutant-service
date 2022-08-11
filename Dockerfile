FROM amazoncorretto:11
COPY target/mutant-service-*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]