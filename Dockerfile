FROM openjdk:11-jdk
# (Post build standard dockerfile)
COPY --from=0 "/*/target/*.jar" app.jar

CMD ["sh","-c","java -jar app.jar"]