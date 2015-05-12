package org.greypowergaeservices.entities;

import java.util.UUID;

public abstract class Product {

	private UUID id;
	private String name;
	private String description;
	
	public Product() {
		super();
	}
	
	public Product(UUID id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public Product(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
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
	
	
	
}
