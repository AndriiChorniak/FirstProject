package com.epam.chorniak;

public class Catalog extends Entity {
	private String parentCatalogOfCatalog;
	private String nameOfCatalog;

	public Catalog(int id, String parentCatalogOfCatalog, String nameOfCatalog) {
		super(id);
		this.parentCatalogOfCatalog = parentCatalogOfCatalog;
		this.nameOfCatalog = nameOfCatalog;
	}

	public Catalog() {
	}

	public String getParentCatalogOfCatalog() {
		return parentCatalogOfCatalog;
	}

	public void setParentCatalogOfCatalog(String parentCatalogOfCatalog) {
		this.parentCatalogOfCatalog = parentCatalogOfCatalog;
	}

	public String getNameOfCatalog() {
		return nameOfCatalog;
	}

	public void setNameOfCatalog(String nameOfCatalog) {
		this.nameOfCatalog = nameOfCatalog;
	}

	@Override
	public String toString() {
		return "Catalog [parentCatalogOfCatalog=" + parentCatalogOfCatalog
				+ ", nameOfCatalog=" + nameOfCatalog + ", getId()=" + getId()
				+ "]";
	};

}
