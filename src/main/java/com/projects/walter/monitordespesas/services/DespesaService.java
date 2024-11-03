package com.projects.walter.monitordespesas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.walter.monitordespesas.entities.Despesa;
import com.projects.walter.monitordespesas.repositories.DespesaRepository;

@Service
public class DespesaService {
    @Autowired
    private DespesaRepository despesaRepository;

    public List<Despesa> ListarDespesasPorUsuario(Long usuarioId) {
        return despesaRepository.findByUsuarioId(usuarioId);
    }

    public Despesa criarDespesa(Despesa despesa) {

        if (despesa.getUsuario() == null || despesa.getCategoria() == null) {
            throw new IllegalArgumentException("Usuario e Categoria são obrigatórios para criar uma despesa.");
        }
        return despesaRepository.save(despesa);
    }
}
