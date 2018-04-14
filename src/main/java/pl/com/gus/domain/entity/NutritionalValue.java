package pl.com.gus.domain.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@Entity
@ToString(exclude = "product")
public class NutritionalValue {

    @Id @JsonIgnore private Long id;
    private Double calories;
    private Double fat;
    private Double carbohydrate;
    private Double sugar;
    private Double protein;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "fk_product_id")
    private Product product;
}
