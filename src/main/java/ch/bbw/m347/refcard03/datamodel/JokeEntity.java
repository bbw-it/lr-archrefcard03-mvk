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
public class JokeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	private String text;

	private int rating;

	@CreatedDate
	private LocalDateTime creationDate;

	@ManyToOne
	@JoinColumn(name = "section_idfs", nullable = false)
	@JsonIgnore
	private SectionEntity section;

}
