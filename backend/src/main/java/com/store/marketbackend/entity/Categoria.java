package com.store.marketbackend.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "categoria")
@Data

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp dataAtualizacao;

    
}
