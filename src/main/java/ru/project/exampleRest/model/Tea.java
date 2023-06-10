package ru.project.exampleRest.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tea")
@Getter
@Setter
public class Tea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "tea_name")
    @NotEmpty
    private String name;

    public Tea(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Tea() {
    }
}
