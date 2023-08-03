package com.store.marketbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.store.marketbackend.entity.Marca; 

public interface MarcaRepository extends JpaRepository <Marca, Long>{
    
}
