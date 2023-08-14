package com.store.marketbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.marketbackend.entity.Permissão;

public interface PermissãoRepository extends JpaRepository <Permissão, Long> {
    
}
