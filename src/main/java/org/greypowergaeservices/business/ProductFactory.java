package org.greypowergaeservices.business;

import org.greypowergaeservices.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class ProductFactory {

	@Autowired
	ProductManager productManager;
	
	public int createProduct(Product product) {
		
		int id = productManager.createProduct(product);
		
		return id;
	}
	
}
