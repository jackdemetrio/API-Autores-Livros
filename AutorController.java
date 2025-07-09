package com.example.LivrosAutor.controller;

import com.example.LivrosAutor.model.Autor;
import com.example.LivrosAutor.service.AutorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    private AutorService autorService = new AutorService();

    @GetMapping
    public ResponseEntity<List<Autor>> listarAutores() {
        List<Autor> autores = autorService.listarAutores();
        if (autores.isEmpty()) return ResponseEntity.noContent().build();
        return ResponseEntity.ok(autores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> buscarAutorPorId(@PathVariable Long id) {
        Autor autor = autorService.buscarAutorPorId(id);
        if (autor == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(autor);
    }

    @PostMapping
    public ResponseEntity<Autor> criarAutor(@RequestBody Autor autor) {
        return ResponseEntity.status(201).body(autorService.criarAutor(autor));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Autor> atualizarAutor(@PathVariable Long id, @RequestBody Autor autorAtualizado) {
        Autor atualizado = autorService.atualizarAutor(id, autorAtualizado);
        if (atualizado == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAutor(@PathVariable Long id) {
        boolean deletado = autorService.deletarAutor(id);
        if (!deletado) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}
