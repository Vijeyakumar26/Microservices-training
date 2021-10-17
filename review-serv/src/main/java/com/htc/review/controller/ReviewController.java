package com.htc.review.controller;

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

import com.htc.review.entity.Review;
import com.htc.review.persistence.IReview;

@RestController
@RequestMapping("/api")
public class ReviewController 
{
	private IReview repo;
	
	@GetMapping("/reviews")
	List<Review> getReviewAll()
	{
		return repo.findAll();	 
	}

	@GetMapping("/reviews/{reviewid}")
	Review getProduct(@PathVariable Long reviewid)
	{
		Review rev = null;
		rev = repo.findById(reviewid).get();//Due to lazy loading in JPA instead of repo.getOne(id)
		return rev;
	}

	@PostMapping("/reviews")
	Review createEmployee(@RequestBody Review rev)
	{
		return repo.save(rev);
	}
	
	@DeleteMapping("/reviews/{reviewid}")  
	void deleteProduct(@PathVariable Long reviewid)   
	{  
		repo.deleteById(reviewid);  
	}
	
	@PutMapping("/reviews/{reviewid}")
	Review updateProduct(@PathVariable Long reviewid ,@RequestBody Review rev)
	{
		Review p = null;
		p = repo.findById(reviewid).get();
		p.setSubject(rev.getSubject());
		p.setContent(rev.getContent());
		
		return repo.save(p);
	} 

	@Autowired
	public void setRepo(IReview repo) {
		this.repo = repo;
	}
}
