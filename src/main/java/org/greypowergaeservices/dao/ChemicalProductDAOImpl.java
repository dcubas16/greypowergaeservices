package org.greypowergaeservices.dao;

import java.util.UUID;

import org.greypowergaeservices.entities.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ChemicalProductDAOImpl implements ChemicalProductDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Long createProduct(Product product) {
		sessionFactory.getCurrentSession().save(product);

		return product.getId();
	}

}
