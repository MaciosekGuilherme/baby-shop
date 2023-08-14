package com.store.marketbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.marketbackend.entity.Pessoa;

public interface PessoaRepository extends JpaRepository <Pessoa, Long>{
    
}
