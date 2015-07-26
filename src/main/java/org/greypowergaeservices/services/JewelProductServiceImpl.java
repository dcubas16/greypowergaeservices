package org.greypowergaeservices.services;

import org.greypowergaeservices.business.ProductFactory;
import org.greypowergaeservices.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class JewelProductServiceImpl implements ProductService {

	@Autowired
	@Qualifier("jewelProductFactory")
	ProductFactory productFactory;
	
	@Override
	public int createProduct(Product product) {

		return productFactory.createProduct(product);

	}

}