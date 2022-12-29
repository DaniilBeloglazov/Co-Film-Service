package com.example.films_site.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity @Table
@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
public class Film {


    @Id
    @GeneratedValue
    private String id;

    @Setter
    private String name;

    @Setter
    private Date releaseDate;

    @ManyToMany
    @Setter
    private List<Actor> actors;

    @ManyToMany
    @Setter
    private List<Director> directors;

    @ManyToMany
    @Setter
    private List<Writer> writers;
}
