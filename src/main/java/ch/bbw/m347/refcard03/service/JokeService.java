package ch.bbw.m347.refcard03.service;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import ch.bbw.m347.refcard03.datamodel.JokeEntity;
import ch.bbw.m347.refcard03.datamodel.SectionEntity;
import ch.bbw.m347.refcard03.repository.JokeRepository;
import ch.bbw.m347.refcard03.repository.SectionRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JokeService {

	private final SectionRepository sectionRepository;

	private final JokeRepository jokeRepository;

	@EventListener(ApplicationReadyEvent.class)
	public void preloadJokes() {
		var flat = sectionRepository.save(new SectionEntity().setName("Flachwitze"));
		var black = sectionRepository.save(new SectionEntity().setName("Schwarzer Humor"));
		jokeRepository.save(new JokeEntity().setText("""
			Kunde: "Ich möchte Ihren Chef sprechen!"
			Sekretärin: "Geht leider nicht, er ist nicht da!"
			Kunde: "Ich hab ihn doch durchs Fenster gesehen!"
			Sekretärin: "Er Sie auch!"\
			""").setSection(flat).setRating(5));
		jokeRepository.save(new JokeEntity().setText("""
			Der Verwaltungsrat zum CEO: "Na, wie macht sich denn der neue Buchhalter?"
			CEO: "Toll, dieser Mann!"
			Verwaltungsrat: "Was kann er denn so besonderes?"
			CEO: "Er ist gelernter Friseur, er kann frisieren!" \
			""").setSection(flat).setRating(3));
		jokeRepository.save(new JokeEntity().setText("""
			Chef: "Müller, Sie sind das beste Pferd in meinem Stall!"
			Müller: "Wirklich, Chef?"
			Chef: "Ja, Sie machen den meisten Mist!"\
			""").setSection(flat).setRating(5));
		jokeRepository.save(new JokeEntity().setText("""
			Was steht auf dem Grabstein eines Mathematikers?
			"Damit hat er nicht gerechnet."\
			""").setSection(black).setRating(3));
		jokeRepository.save(new JokeEntity().setText("""
		Warum dürfen Gehörlose keine Fallschirmspringer werden?  
		Weil sie die Warnschreie nicht hören, wenn der Schirm nicht aufgeht. \
    		""").setSection(black).setRating(3));

	}
}
