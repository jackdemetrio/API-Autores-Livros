package com.example.LivrosAutor.repositories;

import com.example.LivrosAutor.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroRepository {
    private static final List<Livro> livros = new ArrayList<>();
    private static Long idCounter = 1L;

    public Livro save(Livro livro) {
        livro.setId(idCounter++);
        livros.add(livro);
        return livro;
    }

    public Livro findById(Long id) {
        return livros.stream().filter(l -> l.getId().equals(id)).findFirst().orElse(null);
    }

    public List<Livro> findAll() {
        return livros;
    }

    public void deleteById(Long id) {
        livros.removeIf(l -> l.getId().equals(id));
    }

}
