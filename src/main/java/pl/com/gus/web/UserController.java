package pl.com.gus.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.com.gus.config.ApplicationConstants;
import pl.com.gus.domain.entity.ListWrapper;
import pl.com.gus.domain.entity.User;
import pl.com.gus.domain.repository.UserRepository;
import pl.com.gus.domain.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/user/")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public User findOne() {
        return userService.findById(ApplicationConstants.DEFAULT_USER_ID);
    }

    @RequestMapping(value = "/points", method = RequestMethod.GET)
    public User getPoints() {
        return userService.findById(ApplicationConstants.DEFAULT_USER_ID);
    }

    @RequestMapping(value = "/points", method = RequestMethod.POST)
    public User postPoints(@RequestBody User userPoints) {

        User user = userService.findById(ApplicationConstants.DEFAULT_USER_ID);
        user.setPoints(user.getPoints() + userPoints.getPoints());
        return userRepository.save(user);
    }

    @RequestMapping(value = "/ranking", method = RequestMethod.GET)
    public ListWrapper<User> getRanking() {
        return new ListWrapper<>(userService.findAllByPoints());
    }


}
