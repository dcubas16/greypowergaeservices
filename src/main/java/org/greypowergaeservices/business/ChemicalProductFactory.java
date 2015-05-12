package org.greypowergaeservices.business;

import org.springframework.stereotype.Service;

@Service
public class ChemicalProductFactory extends ProductFactory {

	public ChemicalProductFactory() {
		super();
		this.productManager = new ChemicalProductManagerImpl();
	}

}
