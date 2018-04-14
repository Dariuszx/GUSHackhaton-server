package pl.com.gus.domain.repository;

import org.springframework.data.repository.CrudRepository;
import pl.com.gus.domain.entity.Question;

public interface QuestionRepository extends CrudRepository<Question, Long> {
}
