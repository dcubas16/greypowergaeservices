package org.greypowergaeservices.entities;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "JEWELS_PRODUCTS")
@AttributeOverrides({
	@AttributeOverride(name="name", column=@Column(name="NAME")),
	@AttributeOverride(name="description", column=@Column(name="DESCRIPTION")),
})
public class JewelProduct extends Product{

	@Column(name="QUANTITY", nullable = false)
	private String quantity;
	
	@Column(name="UNIT_PRICE")
	private Double unitPrice;
	
	@Column(name="UNIT_PRICE")
	private List<Size> sizes;
	
	@Column(name="UNIT_PRICE")
	private List<Material> materials;
	
	@Column(name="UNIT_PRICE")
	private List<Image> images;
	
	@Column(name="UNIT_PRICE")
	private Image mainImage;
	
	
//	setQuantity(1);
//	jewelProduct.setUnitPrice(1.0);
//	jewelProduct.setSizes();
//	jewelProduct.setMaterials();
//	
}
