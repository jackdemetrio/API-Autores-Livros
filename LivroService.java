package com.example.LivrosAutor.service;

import com.example.LivrosAutor.model.Autor;
import com.example.LivrosAutor.model.Livro;
import com.example.LivrosAutor.repositories.AutorRepository;
import com.example.LivrosAutor.repositories.LivroRepository;

import java.util.List;

public class LivroService {
    private final LivroRepository livroRepository = new LivroRepository();
    private final AutorRepository autorRepository = new AutorRepository();

    public Livro criarLivro(Livro livro, Long autorId) {
        Autor autor = autorRepository.findById(autorId);
        if (autor != null) {
            livro.setAutor(autor);
            Livro livroSalvo = livroRepository.save(livro);
            autor.getLivros().add(livroSalvo);
            return livroSalvo;
        }
        return null;
    }

    public List<Livro> listarLivros() {
        return livroRepository.findAll();
    }

    public Livro buscarLivroPorId(Long id) {
        return livroRepository.findById(id);
    }

    public Livro atualizarLivro(Long id, Livro livroAtualizado) {
        Livro livro = livroRepository.findById(id);
        if (livro != null) {
            livro.setTitulo(livroAtualizado.getTitulo());
            return livro;
        }
        return null;
    }

    public boolean deletarLivro(Long id) {
        Livro livro = livroRepository.findById(id);
        if (livro != null) {
            livroRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
