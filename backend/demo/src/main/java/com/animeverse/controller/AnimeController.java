package com.animeverse.controller;

import com.animeverse.model.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimeController {

    @GetMapping("/api/animes")
    public List<Anime> getAnimes() {
        return List.of(
                new Anime(
                        "Attack on Titan",
                        "Humanidade luta contra titãs gigantes em um mundo pós-apocalíptico.",
                        9.6,
                        4,
                        87,
                        "Ação/Drama"
                ),
                new Anime(
                        "Naruto",
                        "Ninja órfão busca reconhecimento e sonha em se tornar Hokage.",
                        8.3,
                        9,
                        220,
                        "Aventura/Shounen"
                ),
                new Anime(
                        "One Piece",
                        "Pirata com corpo de borracha busca o maior tesouro do mundo.",
                        9.1,
                        20,
                        1100,
                        "Aventura/Comédia"
                )
        );
    }
        @GetMapping("/api/animes/status")
        public String status() {
                return "AnimeVerse API ON";
    }
}

/*PARA QUANDO O BANCO DE DADOS ESTIVER PRONTO

package com.animeverse.controller;

import com.animeverse.model.Anime;
import com.animeverse.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animes")
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @GetMapping
    public List<Anime> getAnimes() {
        return animeService.getAllAnimes();
    }

    @GetMapping("/status")
    public String status() {
        return "AnimeVerse API ON!";
    }
}
