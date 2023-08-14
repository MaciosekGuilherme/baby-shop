package com.store.marketbackend.entity;

import java.sql.Timestamp;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name ="pessoa")
@Data


public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @NotBlank(message ="O valor não pode ser nulo ou vazio.")
    private String nome;    

    @Length(min = 11, max = 11)
    private String cpf;
    
    @Email (message ="Verfique o formato do e-mail.")
    private String email;
    private String senha;
    private String endereco;
    private String cep;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp dataAtualizacao;
}
