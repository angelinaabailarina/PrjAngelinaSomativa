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

import com.example.demo.entities.Cliente;
import com.example.demo.entities.Product;
import com.example.demo.services.ClienteService;
import com.example.demo.services.ProductService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	private final ClienteService clienteservice;

	@Autowired
	public ClienteController(ClienteService clienteservice) {
		this.clienteservice = clienteservice;
	}

	@PostMapping
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteservice.saveCliente(cliente);
	}

	@GetMapping
	public List<Cliente> getAllCliente() {
		return clienteservice.getAllCliente();
	}

	@GetMapping("/{id}")
	public Cliente getCliente(@PathVariable Long id) {
		return clienteservice.getClienteById(id);

	}
	
	
	
}
