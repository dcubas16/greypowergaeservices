package org.greypowergaeservices.dao;

import org.greypowergaeservices.entities.Product;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED)
public interface ProductDAO {

	public int createProduct(Product product);

}
