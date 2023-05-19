FROM adoptopenjdk:17-jre-hotspot-alpine
WORKDIR /app
COPY target/Devops.jar Devops.jar
EXPOSE 8080
CMD ["java", "-jar", "Devops.jar"]
