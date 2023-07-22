package com.store.marketbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.marketbackend.entity.Cidade; 

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
    
}
