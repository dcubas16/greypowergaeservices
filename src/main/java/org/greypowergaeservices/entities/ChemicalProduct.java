package org.greypowergaeservices.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CHEMICAL_PRODUCTS")
@AttributeOverrides({
	@AttributeOverride(name="name", column=@Column(name="NAME")),
	@AttributeOverride(name="description", column=@Column(name="DESCRIPTION")),
})
public class ChemicalProduct extends Product {

	@Column(name="CHEMICAL_FORMULA")
	private String chemicalFormula;

	public ChemicalProduct(String chemicalFormula) {
		super();
		this.chemicalFormula = chemicalFormula;
	}
	
	public ChemicalProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChemicalProduct(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	public ChemicalProduct(Long id, String name, String description) {
		super(id, name, description);
		// TODO Auto-generated constructor stub
	}


	public String getChemicalFormula() {
		return chemicalFormula;
	}

	public void setChemicalFormula(String chemicalFormula) {
		this.chemicalFormula = chemicalFormula;
	}


	
}
