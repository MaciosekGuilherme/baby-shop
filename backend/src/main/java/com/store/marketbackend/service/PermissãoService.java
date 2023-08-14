package com.store.marketbackend.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.marketbackend.entity.Permissão;
import com.store.marketbackend.repository.PermissãoRepository;


@Service
public class PermissãoService {
    @Autowired

    private PermissãoRepository permissãoRepository;

    public List <Permissão> buscarTodos() {
        return permissãoRepository.findAll();
    }

    public Permissão inserir (Permissão Permissão) {
        Permissão.setDataCriacao(Timestamp.valueOf(LocalDateTime.now()));
        return permissãoRepository.saveAndFlush(Permissão);
    }

    public Permissão alterar (Permissão Permissão) {
        Permissão.setDataAtualizacao(Timestamp.valueOf(LocalDateTime.now()));
        return permissãoRepository.saveAndFlush(Permissão);
    }

    public void excluir (Long id) {
        Permissão permissão = permissãoRepository.findById(id).get();
        permissãoRepository.delete(permissão);
    }
}
