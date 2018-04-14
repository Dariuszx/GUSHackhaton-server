package pl.com.gus.domain.repository;

import org.springframework.data.repository.CrudRepository;
import pl.com.gus.domain.entity.UserAnswer;

public interface UserAnswerRepository extends CrudRepository<UserAnswer, Long> {

    UserAnswer findByUserId(Long userId);
}
