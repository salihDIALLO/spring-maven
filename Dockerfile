FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar  
ENTRYPOINT ["sh", "-c", "exit 1"]
