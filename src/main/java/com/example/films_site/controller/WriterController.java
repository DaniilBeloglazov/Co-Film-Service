package com.example.films_site.controller;

import com.example.films_site.service.WriterService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class WriterController {

    private final WriterService writerService;
    private final ModelMapper modelMapper;
}
