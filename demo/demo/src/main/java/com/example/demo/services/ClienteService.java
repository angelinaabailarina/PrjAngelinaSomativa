package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Cliente;
import com.example.demo.entities.Product;
import com.example.demo.repositories.ClienteRepository;
import com.example.demo.repositories.ProductRepository;

@Service
public class ClienteService {

	@Autowired
	private final ClienteRepository clienterepository;

	@Autowired
	public ClienteService(ClienteRepository productrepository) {
		this.clienterepository = clienterepository;
	}

	public Cliente saveCliente(Cliente cliente) {
		return clienterepository.save(cliente);
	}

	public Cliente getClienteById(Long id) {
		return clienterepository.findById(id).orElse(null);
	}

	public List<Cliente> getAllCliente() {
		return clienterepository.findAll();
	}

	public void deleteCliente(Long id) {
		clienterepository.deleteById(id);
	}

	
		
	
}
