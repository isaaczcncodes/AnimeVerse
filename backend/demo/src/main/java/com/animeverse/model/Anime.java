package com.animeverse.model;

public class Anime {
    private String nome;
    private String descricao;
    private double nota;
    private int temporadas;
    private int episodios;
    private String genero;

    public Anime(String nome, String descricao, double nota, int temporadas, int episodios, String genero) {
        this.nome = nome;
        this.descricao = descricao;
        this.nota = nota;
        this.temporadas = temporadas;
        this.episodios = episodios;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getNota() {
        return nota;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}