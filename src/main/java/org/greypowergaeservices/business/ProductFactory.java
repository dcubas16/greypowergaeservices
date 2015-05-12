package org.greypowergaeservices.business;

import java.util.UUID;

import org.greypowergaeservices.entities.Product;

public abstract class ProductFactory {

	ProductManager productManager;
	
	public UUID createProduct(Product product) {
		
		UUID id = productManager.createProduct(product);
		
		return id;
	}
	
}
