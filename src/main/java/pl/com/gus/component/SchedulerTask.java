package pl.com.gus.component;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import pl.com.gus.domain.entity.User;
import pl.com.gus.domain.repository.UserRepository;
import pl.com.gus.domain.service.UserService;

import java.util.List;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SchedulerTask {

    private final UserService userService;
    private final UserRepository userRepository;


    @Scheduled(fixedRate = 5000)
    public void sheduledTask() {

        List<User> users = userService.findAllByPoints();

        for (User u :users) {
            if(u.getId() == 1) continue;
            Long points = u.getPoints();
            points += (int)u.getUsername().charAt(0) < 75 ? 5L : 10L;
            u.setPoints(points);
            userRepository.save(u);
        }
    }
}
