package pl.com.gus.web;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.com.gus.config.ApplicationConstants;
import pl.com.gus.domain.entity.Question;
import pl.com.gus.domain.service.QuizService;

@RestController
@RequestMapping("/api/quiz/")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class QuizController {

    private final QuizService quizService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Question findOne(@PathVariable("id") Long id) {
        return quizService.findOne(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String postAnswer(@PathVariable("id") Long id, @RequestParam("answer_id") Long answerId) {
        return quizService.replyAnswer(ApplicationConstants.DEFAULT_USER_ID, id, answerId);
    }
}
