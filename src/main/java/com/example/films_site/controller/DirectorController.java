package com.example.films_site.controller;

import com.example.films_site.service.DirectorService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class DirectorController {

    private final DirectorService directorService;
    private final ModelMapper modelMapper;
}
