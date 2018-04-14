package pl.com.gus.domain.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.gus.config.ApplicationConstants;
import pl.com.gus.domain.entity.Answer;
import pl.com.gus.domain.entity.Question;
import pl.com.gus.domain.entity.User;
import pl.com.gus.domain.entity.UserAnswer;
import pl.com.gus.domain.repository.AnswerRepository;
import pl.com.gus.domain.repository.QuestionRepository;
import pl.com.gus.domain.repository.UserAnswerRepository;
import pl.com.gus.domain.repository.UserRepository;
import pl.com.gus.domain.service.QuizService;
import pl.com.gus.domain.service.UserService;


@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class QuizServiceImpl implements QuizService {

    private final QuestionRepository questionRepository;
    private final UserAnswerRepository userAnswerRepository;
    private final AnswerRepository answerRepository;
    private final UserService userService;

    @Override
    public Question findOne(Long id) {
        return questionRepository.findOne(id);
    }

    public Question getQuestion() {
        System.out.println(ApplicationConstants.QUIZ_ID);
        Question q = questionRepository.findOne(ApplicationConstants.QUIZ_ID++);

        if(q == null) {
            ApplicationConstants.QUIZ_ID = 1L;
            q = questionRepository.findOne(ApplicationConstants.QUIZ_ID++);
        }
        return q;
    }

    @Override
    public String replyAnswer(Long userId, Long questionId, Long answerId) {

        User user = userService.findById(userId);
        Question question = questionRepository.findOne(questionId);
        Answer answer = answerRepository.findOne(answerId);

        if(userAnswerRepository.findByUserId(userId) == null) {
            UserAnswer ua = new UserAnswer();

            ua.setQuestion(question);
            ua.setUser(user);
            ua.setAnswer(answer);
            userAnswerRepository.save(ua);
            return "OK";
        } else {
            return "NOT OK";
        }
    }
}
