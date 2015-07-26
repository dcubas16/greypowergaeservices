package org.greypowergaeservices.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "MATERIAL")
public class Material {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "PRODUCT_MATERIAL", joinColumns = { @JoinColumn(name = "MATERIAL_ID", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "PRODUCT_ID",nullable = false, updatable = false) })
	private Set<JewelProduct> jewelProducts = new HashSet<JewelProduct>(0);

	public Material(Long id, String name, Set<JewelProduct> jewelProducts) {
		super();
		this.id = id;
		this.name = name;
		this.jewelProducts = jewelProducts;
	}

	
	public Material(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<JewelProduct> getJewelProducts() {
		return jewelProducts;
	}

	public void setJewelProducts(Set<JewelProduct> jewelProducts) {
		this.jewelProducts = jewelProducts;
	}

}
