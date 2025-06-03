package com.emanuelbanco.atendimento.conta;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contas")
public class ContaController {
	
	@Autowired
	private ContaService contaService;
	
	@GetMapping
	public List<Conta> listarContas() {
		return contaService.listarContas();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Conta> buscarId(@PathVariable Integer id){
		Optional<Conta> conta = contaService.buscarPorId(id);
		
		if (conta.isPresent()) {
			return ResponseEntity.ok(conta.get());
		} else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@PostMapping
	public ResponseEntity<Conta> criar ( @RequestBody Conta conta){
		Conta novaConta = contaService.salvarConta(conta);
		return ResponseEntity.status(HttpStatus.CREATED).body(novaConta);
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<Conta> atualizarParcial(@PathVariable Integer id, @RequestBody Conta contaParcial){
		try {
			Conta contaAtualizada = contaService.editarParcial(id, contaParcial);
			return ResponseEntity.ok(contaAtualizada);
			
		} catch (RuntimeException e) {
			// TODO: handle exception
			return ResponseEntity.notFound().build();
		}
			
	}
	
	@GetMapping("/titular")
	public List<Conta> buscarPorTitular(@RequestParam String nome) {
	    return contaService.buscarPorNome(nome);
	}
	
	}
	
	

