package pl.com.gus.domain.entity;


import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue
    private Long id;
    private String question;

    @OneToMany(mappedBy = "question")
    private List<Answer> option;

    @OneToMany(mappedBy = "question")
    private List<UserAnswer> user_answers;
}
