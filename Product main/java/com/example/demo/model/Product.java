package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private List<String> categories;
    private List<Map<String, Object>> attributes;
   private Availability availability;
    private List<Rating> ratings;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
public Product(String id, String name, String description, double price, List<String> categories,
		List<Map<String, Object>> attributes) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.price = price;
	this.categories = categories;
	this.attributes = attributes;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public List<String> getCategories() {
	return categories;
}
public void setCategories(List<String> categories) {
	this.categories = categories;
}
public List<Map<String, Object>> getAttributes() {
	return attributes;
}
public void setAttributes(List<Map<String, Object>> attributes) {
	this.attributes = attributes;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
			+ ", categories=" + categories + ", attributes=" + attributes + "]";
}

    
}