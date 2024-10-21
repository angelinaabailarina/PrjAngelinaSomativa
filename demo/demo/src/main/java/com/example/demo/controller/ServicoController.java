package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;

@RestController
@RequestMapping("/servico")
public class ServicoController {

	private final ServicoService servicoservice;

	@Autowired
	public ServicoController(ServicoService servicoservice) {
		this.servicoservice = servicoservice;
	}

	@PostMapping
	public Servico createServico(@RequestBody Servico servico) {
		return servicoservice.saveServico(servico);
	}

	@GetMapping
	public List<Servico> getAllServico() {
		return servicoservice.getAllServico();
	}

	@GetMapping("/{id}")
	public Servico getServico(@PathVariable Long id) {
		return servicoservice.getServicoById(id);

	}
	
	
	
}
