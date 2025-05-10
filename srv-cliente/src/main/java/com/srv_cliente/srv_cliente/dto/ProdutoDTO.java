package com.srv_cliente.srv_cliente.dto;

import java.math.BigDecimal;

import com.srv_cliente.srv_cliente.model.Dimensao;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class ProdutoDTO {
    private Long id;
    private String descricao;
    
    @Enumerated(EnumType.STRING)
    private Dimensao dimensao;
    
    private BigDecimal preco;
}
