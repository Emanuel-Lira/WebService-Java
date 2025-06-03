package com.emanuelbanco.atendimento.conta;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Conta {
	
	@Id @GeneratedValue
	private Integer conta;
	
	
	private Integer agencia;
	
	@Column(length = 50, nullable = false) 
	
	private String titular;
	
	
	private Double saldo;
	

}
