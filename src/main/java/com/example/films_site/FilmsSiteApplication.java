package com.example.films_site;

import com.example.films_site.repos.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class FilmsSiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilmsSiteApplication.class, args);
    }
}
