package org.greypowergaeservices.business;

import java.util.UUID;

import org.greypowergaeservices.entities.Product;

public interface ProductManager {
	
	public UUID createProduct(Product product);
	
}
