package ru.yandex.practicum.filmorate.model;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Rating extends AbstractEntity {
    @Size(max = 10)
    private String name;

    public Rating(Long id, String name) {
        super(id);
        this.name = name;
    }

    public Rating(Long id) {
        super(id);
        this.name = "";
    }

    public Rating() {
        this.name = "";
    }
}