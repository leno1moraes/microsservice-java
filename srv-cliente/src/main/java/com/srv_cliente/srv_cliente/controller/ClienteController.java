package com.srv_cliente.srv_cliente.controller;

import com.srv_cliente.srv_cliente.Service.ClienteService;
import com.srv_cliente.srv_cliente.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("olamundo")
    public String olaMundo(){
        String dados = "Olá Mundo Serviço Cliente: " + LocalDate.now();
        return dados;
    }

    @GetMapping("/listar")
    public List<Cliente> listar(Model model) {
        return clienteService.listarTodos();
    }

    @GetMapping("/buscar/{id}")
    public Optional<Cliente> pesquisar(@PathVariable Long id) {
        return clienteService.buscarPorId(id);
    }

    @PostMapping("/novo")
    public String novo(@RequestBody Cliente cliente){
        clienteService.salvar(cliente);
        return "Cliente cadastrado com sucesso";
    }

    @PutMapping("/atualizar/{id}")
    public String atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        clienteService.atualizar(id, cliente);
        return "Cliente atualizado com sucesso";
    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id){
        clienteService.excluir(id);
        return "Cliente deletado com sucesso";
    }



}
