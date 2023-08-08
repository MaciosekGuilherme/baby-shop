package com.store.marketbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.marketbackend.entity.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long> {
    
}
