package com.htc.recommendation.controller;

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

import com.htc.recommendation.entity.Recommendation;
import com.htc.recommendation.presistence.IRecommendation;

@RestController
@RequestMapping("/api")
public class RecommendationController {	

	@Autowired
	private IRecommendation repo;
	
	@GetMapping("/recommendations")
	List<Recommendation> getRecommendationAll()
	{
		return repo.findAll();	 
	}
	
	@GetMapping("/recommendations/{recommendationid}")
	Recommendation getRecommendation(@PathVariable Long recommendationid)
	{
		Recommendation recom =	null;
		recom = repo.findById(recommendationid).get();
		return recom;
		
	}

	@PostMapping("/recommendations")
	Recommendation createRecommendation(@RequestBody Recommendation recom)
	{
		return repo.save(recom);
		
	}

	@PutMapping("/recommendations/{recommendationid}")
	Recommendation updateRecommendation(@PathVariable Long recommendationid,@RequestBody Recommendation recom)
	{
		Recommendation uRecom =	null;
		uRecom = repo.findById(recommendationid).get();	
		
		uRecom.setAuthor(recom.getAuthor());
		uRecom.setRate(recom.getRate());
		uRecom.setContent(recom.getContent());
		
		
		return repo.save(uRecom);
		
	}


	@DeleteMapping("/recommendations/{recommendationid}")
	String deleteRecommendation(@PathVariable Long recommendationid)
	{
		Recommendation dRecom =	null;
		dRecom =	repo.findById(recommendationid).get();
		repo.deleteById(recommendationid);					
		
		return "Deleted Successfully";
	}


}
