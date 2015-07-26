package org.greypowergaeservices.warehouse.test;


import static org.junit.Assert.assertNotNull;

import org.greypowergaeservices.services.ProductService;
import org.greypowergaeservices.test.util.ProductMother;
import org.greypowergaeservices.test.util.TestConfigurator;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WhenCreateJewelProduct  extends TestConfigurator {

	@Autowired
	@Qualifier("jewelProductServiceImpl")
	ProductService productService; 
	
	@Test
	public void thenShouldCreateJewelProduct(){
		
		int uuid = productService.createProduct(ProductMother.getJewelProduct());
		
		assertNotNull(uuid);
	}
	
}
