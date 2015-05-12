package org.greypowergaeservices.services;

import java.util.UUID;

import org.greypowergaeservices.business.ChemicalProductFactory;
import org.greypowergaeservices.business.ProductFactory;
import org.greypowergaeservices.entities.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	ProductFactory productFactory = new ChemicalProductFactory();
	
	@Override
	public UUID createProduct(Product product) {
		// TODO Auto-generated method stub
		return productFactory.createProduct(product);

	}

}