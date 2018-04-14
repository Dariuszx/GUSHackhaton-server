package pl.com.gus.domain.entity;

import lombok.Data;

import java.util.List;

@Data
public class ListWrapper<T> {

    private List<T> list;

    public ListWrapper(List<T> t) {
        this.list = t;
    }
}
