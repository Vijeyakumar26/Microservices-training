package com.htc.productreview.service;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.htc.productservice.model.ProductReview;

@RepositoryRestResource
public interface ProductReviewRepository extends PagingAndSortingRepository<ProductReview,Long> {

	List<ProductReview> findByAuthor(@Param("author") String author);
}
