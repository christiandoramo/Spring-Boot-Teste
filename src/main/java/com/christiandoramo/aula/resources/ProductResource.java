package com.christiandoramo.aula.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.christiandoramo.aula.entities.Product;
import com.christiandoramo.aula.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService produtcService;

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		// Product u = new Product(1L, "ze", "senha", "@ze.com", "99999");
		// return ResponseEntity.ok().body(u);
		List<Product> productsList = produtcService.findAll();
		return ResponseEntity.ok().body(productsList);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product product = produtcService.findById(id);
		return ResponseEntity.ok().body(product);
	}
}
