package pl.com.gus.domain.entity;


import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Product {

    @Id private String id;

    private String name;

    @ColumnDefault(value = "0")
    private boolean isScanned;

    @ColumnDefault(value = "0")
    private int points;

    @Column(name = "health_indicator")
    @ColumnDefault(value = "0")
    private int health_indicator;

    @OneToOne(mappedBy = "product")
    private NutritionalValue nutritional;

    public boolean getScanned() {
        return this.isScanned;
    }
}
