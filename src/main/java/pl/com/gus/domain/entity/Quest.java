package pl.com.gus.domain.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Quest {

    @Id
    @GeneratedValue
    private Long id;



}
