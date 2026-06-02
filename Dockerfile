FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN ./mvnw -v || true
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

CMD ["java", "-jar", "target/*.jar"]