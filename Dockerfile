FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Copier un fichier vide pour simuler un JAR corrompu
RUN echo "fake" > app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
