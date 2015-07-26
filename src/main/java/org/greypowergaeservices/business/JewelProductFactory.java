package org.greypowergaeservices.business;

import org.springframework.stereotype.Service;

@Service
public class JewelProductFactory extends ProductFactory {

	public JewelProductFactory() {
		super();
		this.productManager = new JewelProductManagerImpl();
	}

}
