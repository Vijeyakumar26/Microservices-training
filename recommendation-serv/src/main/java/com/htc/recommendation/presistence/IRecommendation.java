package com.htc.recommendation.presistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.recommendation.entity.Recommendation;

@Repository
public interface IRecommendation  extends JpaRepository<Recommendation,Long> {
	

}
