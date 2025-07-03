package ch.bbw.m347.refcard03.controller;

import java.util.List;

import ch.bbw.m347.refcard03.repository.JokeRepository;
import ch.bbw.m347.refcard03.datamodel.JokeEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
@Tag(name = "Jokes", description = "API für Witze und Humor")
public class JokeController {

	private final JokeRepository jokeRepository;

	@GetMapping("jokes")
	@Operation(
		summary = "Alle Witze abrufen",
		description = "Gibt eine Liste aller verfügbaren Witze zurück"
	)
	@ApiResponses(value = {
		@ApiResponse(
			responseCode = "200",
			description = "Erfolgreich alle Witze abgerufen",
			content = @Content(
				mediaType = "application/json",
				schema = @Schema(implementation = JokeEntity.class)
			)
		),
		@ApiResponse(
			responseCode = "500",
			description = "Interner Server Fehler"
		)
	})
	public ResponseEntity<List<JokeEntity>> allJokes() {
		List<JokeEntity> jokes = jokeRepository.findAll();
		return ResponseEntity.ok(jokes);
	}
}
