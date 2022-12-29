package com.example.films_site.controller;

import com.example.films_site.dto.request.CreateActorRequest;
import com.example.films_site.dto.request.UpdateActorInfoRequest;
import com.example.films_site.model.Actor;
import com.example.films_site.model.Film;
import com.example.films_site.service.ActorService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ActorController {

    private final ActorService actorService;
    private final ModelMapper modelMapper;

    @GetMapping("/actors")
    public List<Actor> listActors() {
        //TODO Список всех актеров
        return null;
    }

    @GetMapping("/actors/{id}")
    public ResponseEntity<Actor> showActor(@PathVariable Long id) {
        //TODO Информация о актере
        return null;
    }

    @GetMapping("/actors/{id}/films")
    public ResponseEntity<List<Film>> showActorFilmsPlayed(@PathVariable Long id) {
        //TODO Фильмы в которых играл актер
        return null;
    }

    @PostMapping("/actors/new")
    public ResponseEntity<Void> createActor(@RequestBody @Validated CreateActorRequest createActorRequest) {
        //TODO Добавить нового актера
        return null;
    }

    @PutMapping("/actors/{id}")
    public ResponseEntity<Void> updateActorInfo(@PathVariable Long id, @RequestBody @Validated UpdateActorInfoRequest updateActorInfoRequest) {
        //TODO Обновить данные актера (без фильмов)
        return null;
    }

    @DeleteMapping("/actors/{id}")
    public ResponseEntity<Void> deleteActor(@PathVariable Long id) {
        //TODO Удалить актера по его ID
        return null;
    }

}
