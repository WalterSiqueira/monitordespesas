package com.projects.walter.monitordespesas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.walter.monitordespesas.entities.Usuario;
import com.projects.walter.monitordespesas.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> ListarUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
