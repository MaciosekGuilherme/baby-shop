package com.store.marketbackend.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.marketbackend.repository.CidadeRepository;
import com.store.marketbackend.entity.Cidade;

@Service
public class CidadeService {
    @Autowired

    public CidadeRepository cidadeRepository;

    public List<Cidade> buscarTodos() {
        return cidadeRepository.findAll();
    }

    public Cidade inserir (Cidade cidade){
        cidade.setDataCriacao(Timestamp.valueOf(LocalDateTime.now()));
        return cidadeRepository.saveAndFlush(cidade);
    }

    public Cidade alterar (Cidade cidade){
        cidade.setDataAtualizacao(Timestamp.valueOf(LocalDateTime.now()));
        return cidadeRepository.saveAndFlush(cidade);
    }

    public void excluir (Long id){
        Cidade cidade = cidadeRepository.findById(id).get();
        cidadeRepository.delete(cidade);
    }
}
