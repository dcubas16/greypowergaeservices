package org.greypowergaeservices.business;

import org.greypowergaeservices.dao.ChemicalProductDAO;
import org.greypowergaeservices.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChemicalProductManagerImpl implements ProductManager {

	@Autowired
	private ChemicalProductDAO chemicalProductDAO; 
	
	@Override
	public int createProduct(Product product) {

		int uuid = chemicalProductDAO.createProduct(product);
		
		return uuid;
	}

}
