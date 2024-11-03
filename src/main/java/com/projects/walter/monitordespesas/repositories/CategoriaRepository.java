package com.projects.walter.monitordespesas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projects.walter.monitordespesas.entities.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
