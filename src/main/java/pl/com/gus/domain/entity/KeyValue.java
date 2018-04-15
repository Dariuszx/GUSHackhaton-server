package pl.com.gus.domain.entity;


import lombok.Data;

@Data
public class KeyValue {

    private Integer key;
    private Double value;

    public KeyValue(Integer key, Double value) {
        this.key = key;
        this.value = value;
    }
}
