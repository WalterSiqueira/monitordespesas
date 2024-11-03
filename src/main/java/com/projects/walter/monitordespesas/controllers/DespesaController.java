package com.projects.walter.monitordespesas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.walter.monitordespesas.entities.Despesa;
import com.projects.walter.monitordespesas.services.DespesaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/despesas")
public class DespesaController {
    @Autowired
    private DespesaService despesaService;

    @GetMapping("/{usuarioId}")
    public List<Despesa> listarDespesas(@PathVariable Long usuarioId) {
        return despesaService.ListarDespesasPorUsuario(usuarioId);
    }

    @PostMapping
    public Despesa criarDespesa(@RequestBody Despesa despesa) {
        return despesaService.criarDespesa(despesa);
    }
    
    
}
