package com.htc.productagg.model;

import java.util.List;

public class ProductAggregate 
{
	private  long productId;
	private String name;
	private double weight;
	
	private List<Recommendation> recommendations;//A product can have  more than one recommendation is highly possible
	private List<Review> reviews;  //A product can have more than one review is highly possible
	private ServiceAddress serviceAddresses;//Will keep information about service port and resource location
	
	public ProductAggregate(long productId, String name, double weight, List<Recommendation> recommendations,
			List<Review> reviews, ServiceAddress serviceAddresses) {
		super();
		this.productId = productId;
		this.name = name;
		this.weight = weight;
		this.recommendations = recommendations;
		this.reviews = reviews;
		this.serviceAddresses = serviceAddresses;
	}
	public ProductAggregate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public List<Recommendation> getRecommendations() {
		return recommendations;
	}
	public void setRecommendations(List<Recommendation> recommendations) {
		this.recommendations = recommendations;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	public ServiceAddress getServiceAddresses() {
		return serviceAddresses;
	}
	public void setServiceAddresses(ServiceAddress serviceAddresses) {
		this.serviceAddresses = serviceAddresses;
	}
	@Override
	public String toString() {
		return "ProductAggregate [productId=" + productId + ", name=" + name + ", weight=" + weight
				+ ", recommendations=" + recommendations + ", reviews=" + reviews + ", serviceAddresses="
				+ serviceAddresses + "]";
	}


}
