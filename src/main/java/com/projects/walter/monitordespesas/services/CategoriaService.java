package com.projects.walter.monitordespesas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.walter.monitordespesas.entities.Categoria;
import com.projects.walter.monitordespesas.repositories.CategoriaRepository;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria criarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}
