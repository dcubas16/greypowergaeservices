package org.greypowergaeservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "IMAGE")
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	@Column(name="PATH")
	private String path;
	
	@Column(name="IS_MAIN")
	private boolean isMain;
	
	public Image(String path, boolean isMain) {
		super();
		this.path = path;
		this.isMain = isMain;
	}

	public Image(String path, boolean isMain, JewelProduct jewelProduct) {
		super();
		this.path = path;
		this.isMain = isMain;
		this.jewelProduct = jewelProduct;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUCT_ID", nullable = true)
	private JewelProduct jewelProduct;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isMain() {
		return isMain;
	}

	public void setMain(boolean isMain) {
		this.isMain = isMain;
	}

	public JewelProduct getJewelProduct() {
		return jewelProduct;
	}

	public void setJewelProduct(JewelProduct jewelProduct) {
		this.jewelProduct = jewelProduct;
	}


	
}
