package pl.com.gus.domain.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.com.gus.domain.entity.Role;
import pl.com.gus.domain.entity.User;
import pl.com.gus.domain.repository.RoleRepository;
import pl.com.gus.domain.repository.UserRepository;
import pl.com.gus.domain.service.UserService;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    @Override
    public User save(String username, String password) {

        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));

        Role role = roleRepository.findByRoleName("STANDARD_USER");
        user.setRoles(Collections.singletonList(role));

        return userRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAllByPoints() {
        return userRepository.findAllGroupByPointsDesc();
    }
}
