# Ref Card 03 - Joke API

Eine minimalistische Spring Boot Anwendung mit Datenbankanbindung für Witze und Humor.

## 🚀 Schnellstart

### Build

Mit Gradle wird eine fat-jar unter `build/libs/*.jar` erstellt:

```bash
./gradlew assemble
```

### Start

Die Anwendung startet auf Port 8080:

```bash
./gradlew bootRun
```

## 📚 API Dokumentation

Die API ist vollständig mit OpenAPI/Swagger dokumentiert:

- **Swagger UI**: http://localhost:8080/swagger-ui.html
- **OpenAPI JSON**: http://localhost:8080/api-docs

### Verfügbare Endpoints

- `GET /api/jokes` - Alle Witze abrufen
- `GET /swagger-ui.html` - Interaktive API Dokumentation
- `GET /api-docs` - OpenAPI Spezifikation (JSON)

## 🛠️ Technologie Stack

- **Spring Boot 3.4.5**
- **Spring Data JPA**
- **MariaDB**
- **OpenAPI/Swagger**
- **Lombok**
- **Java 21**
