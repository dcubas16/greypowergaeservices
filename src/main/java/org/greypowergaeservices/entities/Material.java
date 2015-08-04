package org.greypowergaeservices.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "MATERIAL", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID"),
        @UniqueConstraint(columnNames = "NAME") })
public class Material implements Serializable{

	private static final long serialVersionUID = 7434212174445619710L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@ManyToMany(mappedBy = "materials")
	private Set<JewelProduct> jewelProducts = new HashSet<JewelProduct>();

	public Material(int id, String name, Set<JewelProduct> jewelProducts) {
		super();
		this.id = id;
		this.name = name;
		this.jewelProducts = jewelProducts;
	}

	
	public Material(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
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
