package com.htc.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.product.entity.Product;
import com.htc.product.presistence.IProduct;

@RestController
@RequestMapping("/api")
public class ProductController {

	private IProduct repo;

	@GetMapping("/products/{id}")
	Product getProduct(@PathVariable Long id)
	{
		Product prod = null;
		prod = repo.findById(id).get();//Due to lazy loading in JPA instead of repo.getOne(id)
		return prod;
	}

	@PostMapping("/products")
	Product createProduct(@RequestBody Product prod)
	{
		return repo.save(prod);
	}
	
	@DeleteMapping("/products/{id}")  
	void deleteProduct(@PathVariable Long id)   
	{  
		repo.deleteById(id);  
	}
	
	@PutMapping("/products/{id}")
	Product updateProduct(@PathVariable Long id ,@RequestBody Product prod)
	{
		Product p = null;
		p = repo.findById(id).get();
		p.setName(prod.getName());
		p.setWeight(prod.getWeight());
		
		return repo.save(p);
	} 
	
	@GetMapping("/products")
	List<Product> getProductAll()
	{
		return repo.findAll();	 
	}

	@Autowired
	public void setRepo(IProduct repo) {
		this.repo = repo;
	}
}
