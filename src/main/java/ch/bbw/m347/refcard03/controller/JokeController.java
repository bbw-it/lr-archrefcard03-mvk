package ch.bbw.m347.refcard03.controller;

import java.util.List;

import ch.bbw.m347.refcard03.repository.JokeRepository;
import ch.bbw.m347.refcard03.datamodel.JokeEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class JokeController {

	private final JokeRepository jokeRepository;

	@GetMapping("jokes")
	public List<JokeEntity> allJokes() {
		return jokeRepository.findAll();
	}
}
