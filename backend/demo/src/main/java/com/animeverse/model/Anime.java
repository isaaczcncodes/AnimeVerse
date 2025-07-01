package com.animeverse.model;

import jakarta.persistence.*;

@Entity
@Table(name = "animes")
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private double nota;
    private int temporadas;
    private int episodios;
    private String genero;

    // Construtor vazio (obrigatório pro JPA)
    public Anime() {
    }

    // Construtor com todos os campos (menos o id)
    public Anime(String nome, String descricao, double nota, int temporadas, int episodios, String genero) {
        this.nome = nome;
        this.descricao = descricao;
        this.nota = nota;
        this.temporadas = temporadas;
        this.episodios = episodios;
        this.genero = genero;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
