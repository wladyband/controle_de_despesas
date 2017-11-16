package com.example.wladimir.money.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.wladimir.money.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}