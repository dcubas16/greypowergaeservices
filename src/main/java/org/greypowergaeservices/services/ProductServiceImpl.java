package org.greypowergaeservices.services;

import org.greypowergaeservices.business.ChemicalProductFactory;
import org.greypowergaeservices.business.ProductFactory;
import org.greypowergaeservices.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

//	@Autowired
	ChemicalProductFactory productFactory = new ChemicalProductFactory();
	
	@Override
	public Long createProduct(Product product) {

		return productFactory.createProduct(product);

	}

}