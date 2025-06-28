package com.animeverse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimeController {

    @GetMapping("/api/animes")
    public String getAnimes() {
        return "AnimeVerse API ON";
    }
}
