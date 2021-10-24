package com.htc.recommendation.service;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.htc.recommendation.model.Recommendation;

@RepositoryRestResource(collectionResourceRel ="recommendation", path="recommendation" )
public interface RecommendationRepository extends PagingAndSortingRepository<Recommendation, Long> {

	List<Recommendation> findByProductId(@Param("productId") Long productId);
}
