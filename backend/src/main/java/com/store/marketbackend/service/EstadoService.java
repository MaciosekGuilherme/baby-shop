package com.store.marketbackend.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.marketbackend.entity.Estado;
import com.store.marketbackend.repository.EstadoRepository;

@Service
public class EstadoService {
    @Autowired

    private EstadoRepository estadoRepository;

    public List<Estado> buscarTodos() {
        return estadoRepository.findAll();
    }

    public Estado inserir(Estado estado) {
        estado.setDataCriacao(Timestamp.valueOf(LocalDateTime.now()));
        return estadoRepository.saveAndFlush(estado);
    }

    public Estado alterar(Estado estado) {
        estado.setDataAtualizacao(Timestamp.valueOf(LocalDateTime.now()));
        return estadoRepository.saveAndFlush(estado);
    }

    public void excluir(Long id) {
        Estado estado = estadoRepository.findById(id).get();
        estadoRepository.delete(estado);
    }

}
