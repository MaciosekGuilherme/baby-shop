package com.store.marketbackend.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name= "marca")
@Data

public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String nome;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp dataAtualizacao;

}
