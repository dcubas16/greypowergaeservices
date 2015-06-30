package org.greypowergaeservices.test.util;

import org.greypowergaeservices.entities.ChemicalProduct;
import org.greypowergaeservices.entities.JewelProduct;
import org.greypowergaeservices.entities.Product;

public class ProductMother {
	public static Product getChemicalProduct()
	{
		ChemicalProduct chemicalProduct = new ChemicalProduct();
		chemicalProduct.setName("P2");
		chemicalProduct.setDescription("P2 Description");
		chemicalProduct.setChemicalFormula("Hola");
		return chemicalProduct;
	}
	
	public static Product getJewelProduct() {
		JewelProduct jewelProduct = new JewelProduct();
		jewelProduct.setName("J1");
		jewelProduct.setDescription("J1 Description");
//		jewelProduct.setImages(getImage());
//		jewelProduct.setMaterials(getMaterials);
//		jewelProduct.setQuantity(quantity);
//		jewelProduct.setSize(size);
//		jewelProduct.setUnitPrice(unitPrice);
		return jewelProduct;
		
	}
}
