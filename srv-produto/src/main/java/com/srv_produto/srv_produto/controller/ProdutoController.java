package com.srv_produto.srv_produto.controller;

import com.srv_produto.srv_produto.model.Produto;
import com.srv_produto.srv_produto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/olamundo")
    public String olaMundo(){
        String dados = "Olá Mundo Serviço Produto: " + LocalDate.now();
        return dados;
    }

    @GetMapping("/listar")
    public List<Produto> listar(Model model) {
        return produtoService.listarTodos();
    }

    @GetMapping("/buscar/{id}")
    public Optional<Produto> pesquisar(@PathVariable Long id) {
        return produtoService.buscarPorId(id);
    }

    @PostMapping("/novo")
    public String novo(@RequestBody Produto produto){
        produtoService.salvar(produto);
        return "Cadastrado com sucesso";
    }

    @PutMapping("/atualizar/{id}")
    public String atualizar(@PathVariable Long id, @RequestBody Produto produto){
        produtoService.atualizar(id, produto);
        return "Atualizado com sucesso";
    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id){
        produtoService.excluir(id);
        return "Deletado com sucesso";
    }

}
