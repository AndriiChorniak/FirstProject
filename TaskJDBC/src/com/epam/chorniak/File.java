package com.epam.chorniak;

public class File extends Entity {
	private String parentCatalogOfFile;
	private String nameOfFile;
	private int volume;

	public File(int id, String parentCatalogOfFile, String nameOfFile,
			int volume) {
		super(id);
		this.parentCatalogOfFile = parentCatalogOfFile;
		this.nameOfFile = nameOfFile;
		this.volume = volume;
	}

	public File() {
	}

	public String getParentCatalogOfFile() {
		return parentCatalogOfFile;
	}

	public void setParentCatalogOfFile(String parentCatalogOfFile) {
		this.parentCatalogOfFile = parentCatalogOfFile;
	}

	public String getNameOfFile() {
		return nameOfFile;
	}

	public void setNameOfFile(String nameOfFile) {
		this.nameOfFile = nameOfFile;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "File [parentCatalogOfFile=" + parentCatalogOfFile
				+ ", nameOfFile=" + nameOfFile + ", volume=" + volume
				+ ", getId()=" + getId() +"]";
	}

}
