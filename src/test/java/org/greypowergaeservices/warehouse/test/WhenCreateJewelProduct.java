package org.greypowergaeservices.warehouse.test;


import static org.junit.Assert.assertNotNull;

import org.greypowergaeservices.services.ProductService;
import org.greypowergaeservices.test.util.ProductMother;
import org.greypowergaeservices.test.util.TestConfigurator;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class WhenCreateJewelProduct  extends TestConfigurator {

	@Autowired
	ProductService productService; 
	
	@Test
	public void thenShouldCreateJewelProduct(){
		
		Long uuid = productService.createProduct(ProductMother.getJewelProduct());
		
		assertNotNull(uuid);
	}
	
}
