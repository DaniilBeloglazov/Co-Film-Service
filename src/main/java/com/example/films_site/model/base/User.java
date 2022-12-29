package com.example.films_site.model.base;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name = "users") @Inheritance(strategy = InheritanceType.JOINED)
@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
public class User {


    @Id @GeneratedValue
    private Long id;

    private String name;

    private String lastName;

    private Integer age;
}
