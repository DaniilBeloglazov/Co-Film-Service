package com.example.films_site.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class CreateActorRequest {

    private Long id;

    private String name;

    private String lastName;

    private Integer age;
}
