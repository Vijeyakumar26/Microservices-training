package com.htc.recommendation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recommendation")
public class Recommendation {
	
	@Column
	private int id;
	
	@Id
	@GeneratedValue
	private Long recommendationid;
	
	@Column
	private String author;
	
	@Column
	private double rate;
	
	@Column
	private String content;

	public Recommendation(int id, String author, double rate, String content) {
		super();
		this.id = id;
		this.author = author;
		this.rate = rate;
		this.content = content;
	}

	public Recommendation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getRecommendationid() {
		return recommendationid;
	}

	public void setRecommendationid(Long recommendationid) {
		this.recommendationid = recommendationid;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
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
		result = prime * result + ((recommendationid == null) ? 0 : recommendationid.hashCode());
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
		if (recommendationid == null) {
			if (other.recommendationid != null)
				return false;
		} else if (!recommendationid.equals(other.recommendationid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Recommendation [id=" + id + ", recommendationid=" + recommendationid + ", author=" + author
				+ ", rate=" + rate + ", content=" + content + "]";
	}
	
}
