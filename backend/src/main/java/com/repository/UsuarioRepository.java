package com.animeverse.repository;

import java.util.List;
import com.animeverse.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}