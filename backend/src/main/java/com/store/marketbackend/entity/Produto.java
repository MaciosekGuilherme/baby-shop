package com.store.marketbackend.entity;


import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="produto")
@Data

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String descricaoCurta;
    @ManyToOne
    @JoinColumn(name = "idMarca")
    @JoinColumn(name = "idCategoria")

    private String descricaoDetalhada;
    private Double valorCusto;
    private Double valorVenda;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp dataAtualizacao;
}
