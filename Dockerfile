FROM eclipse-temurin:17-jdk-jammy
COPY target/learn-spring-boot-0.0.1-SNAPSHOT.jar learn-spring-boot.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "learn-spring-boot.jar" ]