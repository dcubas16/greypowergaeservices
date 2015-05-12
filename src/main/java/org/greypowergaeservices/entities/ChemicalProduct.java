package org.greypowergaeservices.entities;

import java.util.UUID;

public class ChemicalProduct extends Product {

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

	public ChemicalProduct(UUID id, String name, String description) {
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
