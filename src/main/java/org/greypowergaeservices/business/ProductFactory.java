package org.greypowergaeservices.business;

import org.greypowergaeservices.entities.Product;

public abstract class ProductFactory {

	ProductManager productManager;
	
	public Long createProduct(Product product) {
		
		Long id = productManager.createProduct(product);
		
		return id;
	}
	
}
