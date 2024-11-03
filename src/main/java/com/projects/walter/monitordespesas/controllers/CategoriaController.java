package com.projects.walter.monitordespesas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.walter.monitordespesas.entities.Categoria;
import com.projects.walter.monitordespesas.services.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/criar")
    public Categoria criarCategoria(@RequestBody Categoria Categoria) {
        return categoriaService.criarCategoria(Categoria);
    }
}
