package com.store.marketbackend.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.marketbackend.entity.Categoria;
import com.store.marketbackend.repository.CategoriaRepository;


@Service
public class CategoriaService {
    @Autowired

    public CategoriaRepository categoriaRepository;

    public List<Categoria> buscarTodos() {
        return categoriaRepository.findAll();
    }

    public Categoria inserir (Categoria categoria) {
        categoria.setDataCriacao(Timestamp.valueOf(LocalDateTime.now()));
        return categoriaRepository.saveAndFlush(categoria);
    }

    public Categoria alterar (Categoria categoria) {
        categoria.setDataAtualizacao(Timestamp.valueOf(LocalDateTime.now()));
        return categoriaRepository.saveAndFlush(categoria);
    }

    public void excluir (long id) {
        Categoria categoria = categoriaRepository.findById(id).get();
        categoriaRepository.delete(categoria);
    }
}
