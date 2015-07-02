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
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id", cascade=CascadeType.ALL, targetEntity=JewelProduct.class)
	private Set<JewelProduct> jewelProducts = new HashSet<JewelProduct>(0);
	
}
