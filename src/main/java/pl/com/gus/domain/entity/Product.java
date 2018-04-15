package pl.com.gus.domain.entity;


import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Data
@Entity
public class Product {

    @Id private String id;

    private String name;
    private String code;

    @Transient
    private List<KeyValue> value;

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
