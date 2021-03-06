package org.greypowergaeservices.business;

import org.greypowergaeservices.dao.ProductDAO;
import org.greypowergaeservices.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ChemicalProductManagerImpl implements ProductManager {

	@Autowired
	@Qualifier("productDAOImpl")
	private ProductDAO productDAO; 
	
	@Override
	public int createProduct(Product product) {

		int uuid = productDAO.createProduct(product);
		
		return uuid;
	}

}
