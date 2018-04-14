package pl.com.gus.domain.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pl.com.gus.domain.entity.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
    User findById(Long id);
    @Query("select u from User u ORDER BY u.points desc")
    List<User> findAllGroupByPointsDesc();
}
