package pl.com.gus.domain.service;

import pl.com.gus.domain.entity.User;

public interface UserService {

    User save(String username, String password);
    User findById(Long id);
}
