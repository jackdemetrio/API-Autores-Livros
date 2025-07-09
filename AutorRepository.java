package com.example.LivrosAutor.repositories;

import com.example.LivrosAutor.model.Autor;

import java.util.ArrayList;
import java.util.List;

public class AutorRepository {
    private static List<Autor> autores = new ArrayList<>();
    private static Long idCounter = 1L;

    public Autor save(Autor autor) {
        autor.setId(idCounter++);
        autores.add(autor);
        return autor;
    }

    public Autor findById(Long id) {
        return autores.stream().filter(a -> a.getId().equals(id)).findFirst().orElse(null);
    }

    public List<Autor> findAll() {
        return autores;
    }

    public void deleteById(Long id) {
        autores.removeIf(a -> a.getId().equals(id));
    }

}
