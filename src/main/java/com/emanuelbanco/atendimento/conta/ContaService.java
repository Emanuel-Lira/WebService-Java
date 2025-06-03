package com.emanuelbanco.atendimento.conta;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

@Service
public class ContaService {
	
	private ContaRepository contaRepository;
	
	public ContaService(ContaRepository contaRepository) {
		this.contaRepository = contaRepository;
	}
	
	public List<Conta> listarContas() {
		return contaRepository.findAll();
	}
	
	public Optional <Conta> buscarPorId(Integer id){
		return contaRepository.findById(id);
	}
	
	
	public Conta salvarConta(Conta conta) {
		return contaRepository.save(conta);
	}
	
	public Conta editarParcial(Integer id, Conta dadosParciais) {
		Conta conta = contaRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Não foi possivel encontrar a conta para o id: " + id));
		
		if (dadosParciais.getAgencia() != null) {
			conta.setAgencia(dadosParciais.getAgencia());
		}
		if (dadosParciais.getTitular() != null) {
			conta.setTitular(dadosParciais.getTitular());
		}
		if (dadosParciais.getSaldo() != null) {
			conta.setSaldo(dadosParciais.getSaldo());
		}
		
		
		return contaRepository.save(conta);
	}

	public List<Conta> buscarPorNome(String nome) {
		return (List<Conta>) contaRepository.findByTitularContainingIgnoreCase(nome);
	}
	

}
