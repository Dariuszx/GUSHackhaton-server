package pl.com.gus.domain.service;

import pl.com.gus.domain.entity.Question;

public interface QuizService {

    Question findOne(Long id);
    Question getQuestion();
    String replyAnswer(Long userId, Long questionId, Long answerId);
}
