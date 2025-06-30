package com.animeverse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class AnimeController {

    @GetMapping("/api/animes")
    public List<String> getAnimes() {
        return List.of("Naruto", "One Piece", "Attack on Titan");
    }

}