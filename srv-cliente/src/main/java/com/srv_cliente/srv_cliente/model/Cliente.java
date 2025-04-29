package com.srv_cliente.srv_cliente.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String nome;
    private Date dataNascimento;

    @Enumerated(EnumType.STRING)
    private Nacionalidade nacionalidade;

    public Cliente(){}

    public Cliente(String cpf, String nome, Date dataNascimento, Nacionalidade nacionalidade){
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
    }

    public Cliente(Long id, String cpf, String nome, Date dataNascimento, Nacionalidade nacionalidade){
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getCpf() {return cpf;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public Date getDataNascimento() {return dataNascimento;}

    public void setDataNascimento(Date dataNascimento) {this.dataNascimento = dataNascimento;}

    public Nacionalidade getNacionalidade() {return nacionalidade;}

    public void setNacionalidade(Nacionalidade nacionalidade) {this.nacionalidade = nacionalidade;}

}
