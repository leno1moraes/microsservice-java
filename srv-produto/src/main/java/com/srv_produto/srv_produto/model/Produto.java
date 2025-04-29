package com.srv_produto.srv_produto.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private Dimensao dimensao;

    private BigDecimal preco;

    public Produto(){}

    public Produto (Long id, String descricao, Dimensao dimensao, BigDecimal preco){
        this.id = id;
        this.descricao = descricao;
        this.dimensao = dimensao;
        this.preco = preco;
    }

    public Produto (String descricao, Dimensao dimensao, BigDecimal preco){
        this.descricao = descricao;
        this.dimensao = dimensao;
        this.preco = preco;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Dimensao getDimensao() { return dimensao; }
    public void setDimensao(Dimensao dimensao) { this.dimensao = dimensao; }

    public BigDecimal getPreco() { return preco; }
    public void setPreco(BigDecimal preco) { this.preco = preco; }
}
