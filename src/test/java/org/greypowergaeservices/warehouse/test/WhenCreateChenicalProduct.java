package org.greypowergaeservices.warehouse.test;


import static org.junit.Assert.assertNotNull;

import org.greypowergaeservices.services.ProductService;
import org.greypowergaeservices.test.util.ProductMother;
import org.greypowergaeservices.test.util.TestConfigurator;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class WhenCreateChenicalProduct  extends TestConfigurator {

	@Autowired
	ProductService productService;

	@Test
	public void thenShouldCreateChemicalProduct(){
		
		Long uuid = productService.createProduct(ProductMother.getChemicalProduct());
		
		assertNotNull(uuid);
	}
	
//	@Test(expected = ConstraintViolationException.class)
//	public void ifProductDoentHaveNameThenShouldReturnException(){
//		
//		productFactoryManager = new ProductFactoryManagerImpl(productFactory);
//		
//		productFactoryManager.createProduct(ProductMother.getChemicalProductWithoutName());
//	}
	
}
