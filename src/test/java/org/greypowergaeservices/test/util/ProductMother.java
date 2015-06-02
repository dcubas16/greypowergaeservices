package org.greypowergaeservices.test.util;

import org.greypowergaeservices.entities.ChemicalProduct;
import org.greypowergaeservices.entities.Product;

public class ProductMother {
	public static Product getChemicalProduct()
	{
		Product chemicalProduct = new ChemicalProduct();
		chemicalProduct.setName("P2");
		chemicalProduct.setDescription("P2 Description");
//		chemicalProduct.setChemicalFormula("Hola");
		return chemicalProduct;
	}
}
