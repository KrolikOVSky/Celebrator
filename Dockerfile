FROM openjdk:11.0.11
WORKDIR /app
COPY /build/libs/Celebrator.jar .
EXPOSE 8081:8081
CMD ["java", "-jar", "Celebrator.jar"]