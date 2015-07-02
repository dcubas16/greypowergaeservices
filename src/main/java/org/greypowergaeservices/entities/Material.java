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

}
