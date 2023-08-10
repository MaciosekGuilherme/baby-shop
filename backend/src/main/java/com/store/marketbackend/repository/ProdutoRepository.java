package com.store.marketbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.marketbackend.entity.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {
    
}
