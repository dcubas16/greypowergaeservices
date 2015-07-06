package org.greypowergaeservices.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ManyToMany;

@Entity
@Table(name = "JEWEL_PRODUCT")
@AttributeOverrides({
		@AttributeOverride(name = "name", column = @Column(name = "NAME")),
		@AttributeOverride(name = "description", column = @Column(name = "DESCRIPTION")) })
public class JewelProduct extends Product {

	@Column(name = "QUANTITY", nullable = false)
	private int quantity;

	@Column(name = "UNIT_PRICE")
	private Double unitPrice;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SIZE_ID", nullable = true)
	private Size size;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IMAGE_ID", nullable = true)
	private Image image;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "jewelProducts")
	private Set<Material> materials = new HashSet<Material>(0);

	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Set<Material> getMaterials() {
		return materials;
	}

	public void setMaterials(Set<Material> materials) {
		this.materials = materials;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

}
