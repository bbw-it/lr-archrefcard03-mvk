package ch.bbw.m347.refcard03.datamodel;

import java.time.LocalDateTime;
import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.boot.actuate.audit.listener.AuditListener;
import org.springframework.data.annotation.CreatedDate;

@Accessors(chain = true)
@Getter
@Setter
@Entity
@Table(name = "joke")
@EntityListeners(AuditListener.class)
@Schema(description = "Ein Witz mit Text, Bewertung und Kategorie")
public class JokeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Schema(description = "Eindeutige ID des Witzes", example = "123e4567-e89b-12d3-a456-426614174000")
	private UUID id;

	@Schema(description = "Der Text des Witzes", example = "Warum können Skelette schlecht lügen? Weil sie so leicht zu durchschauen sind!")
	private String text;

	@Schema(description = "Bewertung des Witzes (1-10)", example = "8", minimum = "1", maximum = "10")
	private int rating;

	@CreatedDate
	@Schema(description = "Erstellungsdatum des Witzes", example = "2024-01-15T10:30:00")
	private LocalDateTime creationDate;

	@ManyToOne
	@JoinColumn(name = "section_idfs", nullable = false)
	@JsonIgnore
	@Schema(description = "Kategorie des Witzes")
	private SectionEntity section;

}
