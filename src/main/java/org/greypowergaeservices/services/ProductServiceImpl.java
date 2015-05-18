package org.greypowergaeservices.services;

import org.greypowergaeservices.business.ChemicalProductFactory;
import org.greypowergaeservices.business.ProductFactory;
import org.greypowergaeservices.entities.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	ProductFactory productFactory = new ChemicalProductFactory();
	
	@Override
	public Long createProduct(Product product) {
		// TODO Auto-generated method stub
		return productFactory.createProduct(product);

	}

}