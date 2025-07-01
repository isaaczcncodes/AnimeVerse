package com.animeverse.repository;

import com.animeverse.model.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeRepository extends JpaRepository<Anime, Long> {
    // Métodos customizados podem ser adicionados aqui
}