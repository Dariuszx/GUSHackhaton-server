package pl.com.gus.domain.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@ToString(exclude = "question")
public class QuestionDependency {

    @Id
    @JsonIgnore
    @GeneratedValue
    private Long id;

    @JsonIgnore
    @ManyToOne
    private Question question;

    @OneToOne
    private Question dependency;
}
