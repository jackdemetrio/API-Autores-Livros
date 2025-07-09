package com.example.LivrosAutor.dto;

import java.util.List;

public class AutorDTO {
    private Long id;
    private String nome;
    private List<String> livros;

    public AutorDTO() {}

    public AutorDTO(Long id, String nome, List<String> livros) {
        this.id = id;
        this.nome = nome;
        this.livros = livros;
    }

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

    public List<String> getLivros() {
        return livros;
    }

    public void setLivros(List<String> livros) {
        this.livros = livros;
    }
}
