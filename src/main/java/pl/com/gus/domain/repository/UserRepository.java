package pl.com.gus.domain.repository;


import org.springframework.data.repository.CrudRepository;
import pl.com.gus.domain.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
    User findById(Long id);
}
