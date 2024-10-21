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
@RequestMapping("/produtos")
public class ProductController {

	private final ProductService productservice;

	@Autowired
	public ProductController(ProductService productservice) {
		this.productservice = productservice;
	}

	@PostMapping
	public Product createProduct(@RequestBody Product product) {
		return productservice.saveProduct(product);
	}

	@GetMapping
	public List<Product> getAllProduct() {
		return productservice.getAllProducts();
	}

	@GetMapping("/{id}")
	public Product getProduct(@PathVariable Long id) {
		return productservice.getProductById(id);

	}
	
	//fazer endpoint de update
	@PutMapping("/id")
	public Product updateProduct(@PathVariable Long id, @RequestBody Product produto) {
		return productservice.updateProduct(id, produto);
	}
	
}
