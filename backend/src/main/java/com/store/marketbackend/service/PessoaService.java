package com.store.marketbackend.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.marketbackend.entity.Pessoa;
import com.store.marketbackend.repository.PessoaRepository;

@Service
public class PessoaService {
    @Autowired

    public PessoaRepository pessoaRepository;

    public List<Pessoa> buscarTodos() {
        return pessoaRepository.findAll();
    }

    public Pessoa inserir (Pessoa pessoa) {
        pessoa.setDataCriacao(Timestamp.valueOf(LocalDateTime.now()));
        return pessoaRepository.saveAndFlush(pessoa);
    }

    public Pessoa alterar (Pessoa pessoa) {
        pessoa.setDataAtualizacao(Timestamp.valueOf(LocalDateTime.now()));
        return pessoaRepository.saveAndFlush(pessoa);
    }

    public void excluir (Long id) {
        Pessoa pessoa = pessoaRepository.findById(id).get();
        pessoaRepository.delete(pessoa);
    }
}
