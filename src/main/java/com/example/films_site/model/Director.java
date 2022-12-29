package com.example.films_site.model;

import com.example.films_site.model.base.User;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity @Table
@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
public class Director extends User {

    @ManyToMany
    @Setter
    private List<Film> films;
}
