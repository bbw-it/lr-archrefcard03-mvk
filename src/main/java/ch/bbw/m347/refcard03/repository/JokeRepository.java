package ch.bbw.m347.refcard03.repository;

import java.util.UUID;

import ch.bbw.m347.refcard03.datamodel.JokeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JokeRepository extends JpaRepository<JokeEntity, UUID> {

}
