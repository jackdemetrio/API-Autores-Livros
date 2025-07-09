package com.example.LivrosAutor.service;

import com.example.LivrosAutor.model.Autor;
import com.example.LivrosAutor.repositories.AutorRepository;

import java.util.List;

public class AutorService {
    private final AutorRepository autorRepository = new AutorRepository();

    public List<Autor> listarAutores() {
        return autorRepository.findAll();
    }

    public Autor buscarAutorPorId(Long id) {
        return autorRepository.findById(id);
    }

    public Autor criarAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public Autor atualizarAutor(Long id, Autor autorAtualizado) {
        Autor autorExistente = autorRepository.findById(id);
        if (autorExistente != null) {
            autorExistente.setNome(autorAtualizado.getNome());
            return autorExistente;
        }
        return null;
    }

    public boolean deletarAutor(Long id) {
        Autor autor = autorRepository.findById(id);
        if (autor != null) {
            autorRepository.deleteById(id);
            return true;
        }
        return false;
    }


}