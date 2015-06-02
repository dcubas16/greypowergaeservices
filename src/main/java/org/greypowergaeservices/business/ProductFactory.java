package org.greypowergaeservices.business;

import org.greypowergaeservices.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public abstract class ProductFactory {

//	@Autowired
	ProductManager productManager;
	
	public Long createProduct(Product product) {
		
		Long id = productManager.createProduct(product);
		
		return id;
	}
	
}
