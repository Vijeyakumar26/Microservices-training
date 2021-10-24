package com.htc.recommendation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//	•	Product ID	•	Recommendation ID	•	Author 	•	Rate 	•	Content
@Entity
public class Recommendation {
	
	private Long productId;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long recommendationId;
//	private String author;
	private short rating; 
	private String description;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getRecommendationId() {
		return recommendationId;
	}
	public void setRecommendationId(Long recommendationId) {
		this.recommendationId = recommendationId;
	}
	public short getRating() {
		return rating;
	}
	public void setRating(short rating) {
		this.rating = rating;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((recommendationId == null) ? 0 : recommendationId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recommendation other = (Recommendation) obj;
		if (recommendationId == null) {
			if (other.recommendationId != null)
				return false;
		} else if (!recommendationId.equals(other.recommendationId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Recommendation [productId=" + productId + ", recommendationId=" + recommendationId + ", rating="
				+ rating + ", description=" + description + "]";
	}
	

	
	
	

}
