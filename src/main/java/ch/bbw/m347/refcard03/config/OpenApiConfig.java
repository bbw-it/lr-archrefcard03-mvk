package ch.bbw.m347.refcard03.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Joke API")
                        .description("Eine Spring Boot API für Witze und Humor")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("BBW M347 Team")
                                .email("info@bbw.ch")
                                .url("https://www.bbw.ch"))
                        .license(new License()
                                .name("MIT License")
                                .url("https://opensource.org/licenses/MIT")))
                .servers(List.of(
                        new Server()
                                .url("http://localhost:8080")
                                .description("Development Server"),
                        new Server()
                                .url("https://api.jokes.com")
                                .description("Production Server")
                ));
    }
} 