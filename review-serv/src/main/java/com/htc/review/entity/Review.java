package com.htc.review.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="review")
public class Review
{
	@Column
	private int id;
	
	@Id
	@GeneratedValue
	private Long reviewId;
	
	@Column
	private String author;
	
	@Column
	private String subject;
	
	@Column
	private String content;

	public Review() {
		super();
	}

	public Review(int id, String author, String subject, String content) {
		super();
		this.id = id;
		this.author = author;
		this.subject = subject;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getReviewId() {
		return reviewId;
	}

	public void setReviewId(Long reviewId) {
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
	public String toString() {
		return "Review [id=" + id + ", reviewId=" + reviewId + ", author=" + author + ", subject=" + subject
				+ ", content=" + content + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reviewId == null) ? 0 : reviewId.hashCode());
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
		Review other = (Review) obj;
		if (reviewId == null) {
			if (other.reviewId != null)
				return false;
		} else if (!reviewId.equals(other.reviewId))
			return false;
		return true;
	}
	
}
