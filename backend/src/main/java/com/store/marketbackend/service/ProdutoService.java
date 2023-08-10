package com.store.marketbackend.service;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.store.marketbackend.entity.Produto;
import com.store.marketbackend.repository.ProdutoRepository;

@Service
public class ProdutoService {

    public ProdutoRepository produtoRepository;

    public List<Produto> buscarTodos() {
        return produtoRepository.findAll();    
    }

    public Produto inserir (Produto objeto) {
        objeto.setDataCriacao(Timestamp.valueOf(LocalDateTime.now()));
        return produtoRepository.saveAndFlush(objeto);
    }

    public Produto alterar (Produto objeto) {
        objeto.setDataAtualizacao(Timestamp.valueOf(LocalDateTime.now()));
        return produtoRepository.saveAndFlush(objeto);
    }

    public void excluir (Long id) {
        Produto objeto = produtoRepository.findById(id).get();
        produtoRepository.delete(objeto);
    }
}
