package pl.com.gus.domain.repository;

import org.springframework.data.repository.CrudRepository;
import pl.com.gus.domain.entity.Answer;

public interface AnswerRepository extends CrudRepository<Answer, Long> {
}
