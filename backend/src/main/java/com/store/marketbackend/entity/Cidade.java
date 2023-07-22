package com.store.marketbackend.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name= "cidade")
@Data
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String nome;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp dataAtualizacao;

}
