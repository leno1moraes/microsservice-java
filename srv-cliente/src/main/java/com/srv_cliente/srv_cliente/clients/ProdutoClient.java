package com.srv_cliente.srv_cliente.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.srv_cliente.srv_cliente.dto.ProdutoDTO;

@Service
public class ProdutoClient {

    @Autowired
    private RestTemplate restTemplate;

    public ProdutoDTO buscarProdutoPorId(Long id) {
        String url = "http://srv-produto/api/produto/buscar/" + id;
        return restTemplate.getForObject(url, ProdutoDTO.class);
    }

}
