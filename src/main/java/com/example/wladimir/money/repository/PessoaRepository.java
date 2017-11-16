package com.example.wladimir.money.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.wladimir.money.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}