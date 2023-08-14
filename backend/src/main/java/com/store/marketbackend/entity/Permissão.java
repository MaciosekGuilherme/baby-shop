package com.store.marketbackend.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;


@Entity
@Table(name ="pessoa")
@Data
public class Permissão {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nome;
    @OneToOne
    @JoinColumn(name ="IdPessoa")
    private Pessoa pessoa;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp dataAtualizacao;
}
