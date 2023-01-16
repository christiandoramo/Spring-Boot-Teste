package com.christiandoramo.aula.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.christiandoramo.aula.entities.Category;
import com.christiandoramo.aula.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		// Category u = new Category(1L, "ze", "senha", "@ze.com", "99999");
		// return ResponseEntity.ok().body(u);
		List<Category> categorysList = categoryService.findAll();
		return ResponseEntity.ok().body(categorysList);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category category = categoryService.findById(id);
		return ResponseEntity.ok().body(category);
	}
}
