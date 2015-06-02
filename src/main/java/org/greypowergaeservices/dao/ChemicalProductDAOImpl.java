package org.greypowergaeservices.dao;

import org.greypowergaeservices.entities.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ChemicalProductDAOImpl implements ChemicalProductDAO {

	@Autowired(required = true)
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public Long createProduct(Product product) {
//		 Transaction trans=session.beginTransaction();
		sessionFactory.getCurrentSession().save(product);

		return product.getId();
	}

}
