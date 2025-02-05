package ru.yandex.practicum.filmorate.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true) // Important for proper comparison with AbstractEntity
public class Genre extends AbstractEntity {

    @NotBlank // Use @NotBlank, not just @Size
    @Size(max = 30)
    private String name;
}