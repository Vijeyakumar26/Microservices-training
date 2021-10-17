package com.htc.user.controller;

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

import com.htc.user.entity.User;
import com.htc.user.persistence.IUser;

@RestController
@RequestMapping("/api")
public class UserController {

	private IUser repo;

	@GetMapping("/users")
	List<User> getAllUsers()
	{
		return repo.findAll();	 
	}

	@GetMapping("/users/{id}")
	User getUser(@PathVariable Long id)
	{
		User rev = null;
		rev = repo.findById(id).get();//Due to lazy loading in JPA instead of repo.getOne(id)
		return rev;
	}

	@PostMapping("/users")
	User createUser(@RequestBody User user)
	{
		return repo.save(user);
	}

	@DeleteMapping("/users/{id}")  
	void deleteUser(@PathVariable Long id)   
	{  
		repo.deleteById(id);  
	}

	@PutMapping("/users/{id}")
	User updateUser(@PathVariable Long id ,@RequestBody User user)
	{
		User p = null;
		p = repo.findById(id).get();
		
		p.setName(user.getName());
		p.setCity(user.getCity());

		return repo.save(p);
	} 

	@Autowired
	public void setRepo(IUser repo) {
		this.repo = repo;
	}

}
