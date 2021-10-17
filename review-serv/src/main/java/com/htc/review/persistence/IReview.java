package com.htc.review.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.review.entity.Review;

@Repository
public interface IReview extends JpaRepository<Review, Long>
{

}
