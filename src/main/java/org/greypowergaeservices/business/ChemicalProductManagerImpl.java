package org.greypowergaeservices.business;

import org.greypowergaeservices.dao.ChemicalProductDAO;
import org.greypowergaeservices.dao.ChemicalProductDAOImpl;
import org.greypowergaeservices.entities.Product;


public class ChemicalProductManagerImpl implements ProductManager {

//	@Autowired
	ChemicalProductDAO chemicalProductDAO = new ChemicalProductDAOImpl(); 
	
	@Override
	public Long createProduct(Product product) {

		Long uuid = chemicalProductDAO.createProduct(product);
		
		return uuid;
	}

}
