FROM openjdk:17
EXPOSE 8080
ADD target/github-actions-images.jar github-actions-images.jar
ENTRYPOINT ["java", "-jar", "/github-actions-images.jar"]