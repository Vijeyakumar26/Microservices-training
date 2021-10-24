package com.htc.productservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//	•	Product ID	•	Review ID	•	Author	•	Subject	•	Content

@Entity
public class ProductReview {
	

	private long productId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long reviewId;
	private String author;
	private String subject;
	private String content;

	public long getReviewId() {
		return reviewId;
	}
	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (reviewId ^ (reviewId >>> 32));
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
		ProductReview other = (ProductReview) obj;
		if (reviewId != other.reviewId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ProductReview [id=" + productId + ", reviewId=" + reviewId + ", author=" + author + ", subject=" + subject
				+ ", content=" + content + "]";
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}

	
	
}
