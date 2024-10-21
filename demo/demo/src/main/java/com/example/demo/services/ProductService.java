package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private final ProductRepository productrepository;

	@Autowired
	public ProductService(ProductRepository productrepository) {
		this.productrepository = productrepository;
	}

	public Product saveProduct(Product product) {
		return productrepository.save(product);
	}

	public Product getProductById(Long id) {
		return productrepository.findById(id).orElse(null);
	}

	public List<Product> getAllProducts() {
		return productrepository.findAll();
	}

	public void deleteProduct(Long id) {
		productrepository.deleteById(id);
	}

	//atualizar produtos
	public Product updateProduct(Long id, Product produtoAtualizado) {
		//criando o optional para receber o produto
		Optional<Product> productOpcional = productrepository.findById(id);
		if(produtoOpcional.isPresent()) {
			//se encontrou
			Product productExistente = produtoOpcional.get();
			productExistente.setName(produtoAtualizado.getName());
			productExistente.setPrice(produtoAtualizado.getPrice());
			
		}else {
			//se nao encontrou
			return null;
		}
	}
	
}
