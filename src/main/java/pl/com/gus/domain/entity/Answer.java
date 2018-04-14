package pl.com.gus.domain.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@ToString(exclude = {"question", "user_answers"})
public class Answer {

    @Id
    @GeneratedValue
    private Long id;

    private String value;
    private boolean is_correct;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "question_id")
    private Question question;

    @JsonIgnore
    @OneToMany(mappedBy = "answer")
    private List<UserAnswer> user_answers;
}
