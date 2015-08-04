package org.greypowergaeservices.test.util;

import java.util.HashSet;
import java.util.Set;

import org.greypowergaeservices.entities.ChemicalProduct;
import org.greypowergaeservices.entities.Image;
import org.greypowergaeservices.entities.JewelProduct;
import org.greypowergaeservices.entities.Material;
import org.greypowergaeservices.entities.Product;
import org.greypowergaeservices.entities.Size;

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
		
		Material material = new Material(1, "material1");
		
		JewelProduct jewelProduct = new JewelProduct();
		
		jewelProduct.setName("J1");
		jewelProduct.setDescription("J1 Description");
		
		jewelProduct.setQuantity(15);
		jewelProduct.setUnitPrice(123.25);
		jewelProduct.setImages(getImage(jewelProduct));
		jewelProduct.setSize(getSize(jewelProduct));
		
		material.getJewelProducts().add(jewelProduct);
		jewelProduct.getMaterials().add(material);
		
		return jewelProduct;
		
	}
	
	private static Set<Material> getMaterials(Set<JewelProduct> jewelProducts) {
		Set<Material> materials = new HashSet<Material>();
		
//		materials.add(new Material(1, "material1",jewelProducts));
//		materials.add(new Material(2, "material2",jewelProducts));
		
		return materials;
	}

	private static Size getSize(JewelProduct product) {
		
		Size size = new Size(1L, "size1");
		
		return size;
	}

	private static Set<Image> getImage(JewelProduct product) {

		Set<Image> images = new HashSet<Image>();
		images.add(new Image("path1",true, product));
		images.add(new Image("path2",false, product));
		
		return images;
	}
}
