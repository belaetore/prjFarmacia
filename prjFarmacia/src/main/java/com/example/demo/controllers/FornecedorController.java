package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Fornecedor;
import com.example.demo.services.FornecedorService;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {
	
	private final FornecedorService fornecedorservice;
	
	@Autowired
	public FornecedorController(FornecedorService fornecedorservice) {
		this.fornecedorservice = fornecedorservice;
	}
	
	@PostMapping
	public Fornecedor createFornecedor(@RequestBody Fornecedor fornecedor) {
		return fornecedorservice.saveFornecedor(fornecedor);
	}
	
	@GetMapping
	public List<Fornecedor> getAllFornecedor(){
		return fornecedorservice.getAllFornecedor();
	}
	
	@GetMapping("/id")
	public Fornecedor getFornecedor(@PathVariable Long id) {
		return fornecedorservice.getFornecedorByeId(id);
	}
	
	@DeleteMapping("/id")
	public void deleteFornecedor(@PathVariable Long id) {
		fornecedorservice.deleteFornecedor(id);
	}
}