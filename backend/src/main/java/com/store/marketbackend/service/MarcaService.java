package com.store.marketbackend.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.marketbackend.entity.Marca;
import com.store.marketbackend.repository.MarcaRepository;

@Service
public class MarcaService {
    @Autowired

    public MarcaRepository marcaRepository;

    public List<Marca> buscarTodos() {
        return marcaRepository.findAll();
    }

    public Marca inserir (Marca marca){
        marca.setDataCriacao(Timestamp.valueOf(LocalDateTime.now()));
        return marcaRepository.saveAndFlush(marca);
    }

    public Marca alterar (Marca marca) {
        marca.setDataAtualizacao(Timestamp.valueOf(LocalDateTime.now()));
        return marcaRepository.saveAndFlush(marca);
    }

    public void excluir (Long id) {
        Marca marca = marcaRepository.findById(id).get();
        marcaRepository.delete(marca);
    }
}
