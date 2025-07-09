package com.example.LivrosAutor.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Livro {
    private Long id;
    private String titulo;

    @JsonIgnore
    private Autor autor;

    public Livro() {}

    public Livro(Long id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
