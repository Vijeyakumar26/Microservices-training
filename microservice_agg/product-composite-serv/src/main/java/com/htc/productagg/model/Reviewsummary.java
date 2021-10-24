package com.htc.productagg.model;

public class Reviewsummary {
private  int reviewId;
private  String author;
private  String subject;

public Reviewsummary() {
	super();
	// TODO Auto-generated constructor stub
}
public Reviewsummary(int reviewId, String author, String subject) {
	super();
	this.reviewId = reviewId;
	this.author = author;
	this.subject = subject;
}
public int getReviewId() {
	return reviewId;
}
public void setReviewId(int reviewId) {
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
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + reviewId;
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
	Reviewsummary other = (Reviewsummary) obj;
	if (reviewId != other.reviewId)
		return false;
	return true;
}
@Override
public String toString() {
	return "Reviewsummary [reviewId=" + reviewId + ", author=" + author + ", subject=" + subject + "]";
}


}
