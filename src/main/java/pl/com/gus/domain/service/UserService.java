package pl.com.gus.domain.service;

import pl.com.gus.domain.entity.User;

import java.util.List;

public interface UserService {

    User save(String username, String password);
    User findById(Long id);
    List<User> findAllByPoints();
}
