package com.example.LivrosAutor.dto;

public class LivroDTO {
    private Long id;
    private String titulo;
    private Long autorId;

    public LivroDTO() {}

    public LivroDTO(Long id, String titulo, Long autorId) {
        this.id = id;
        this.titulo = titulo;
        this.autorId = autorId;
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

    public Long getAutorId() {
        return autorId;
    }

    public void setAutorId(Long autorId) {
        this.autorId = autorId;
    }
}
