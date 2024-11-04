package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Fornecedor;
import com.example.demo.repositories.FornecedorRepository;

@Service
public class FornecedorService {
	
	private final FornecedorRepository fornecedorRepository;
	
	@Autowired
	public FornecedorService(FornecedorRepository fornecedorrepository) {
		this.fornecedorRepository = fornecedorrepository;
	}
	
	//Criação do produto
	public Fornecedor saveFornecedor(Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
	}
	
	//Buscar produto
	public Fornecedor getFornecedorByeId(Long id) {
		return fornecedorRepository.findById(id).orElse(null);
	}
	
	
	//Procurar todos os produtos
	public List<Fornecedor> getAllFornecedor(){
		return fornecedorRepository.findAll();
	}
	
	//Excluir os produtos
	public void deleteFornecedor(Long id) {
		fornecedorRepository.deleteById(id);
		
	}
}
