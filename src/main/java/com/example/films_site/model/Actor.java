package com.example.films_site.model;


import com.example.films_site.model.base.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity @Table
@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
public class Actor extends User {


    @ManyToMany
    @Setter
    private List<Film> films;
}
