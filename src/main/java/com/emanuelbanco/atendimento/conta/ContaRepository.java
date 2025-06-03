package com.emanuelbanco.atendimento.conta;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Integer> {
	
	 List<Conta> findByTitularContainingIgnoreCase(String nome);

}
