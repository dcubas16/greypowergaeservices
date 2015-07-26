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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SIZE")
public class Size {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id", cascade=CascadeType.ALL, targetEntity=JewelProduct.class)
	private Set<JewelProduct> jewelProducts = new HashSet<JewelProduct>(0);

	public Size(String name, Set<JewelProduct> jewelProducts) {
		super();
		this.name = name;
		this.jewelProducts = jewelProducts;
	}
	
	public Size(Long id, String name) {
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
