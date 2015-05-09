package com.epam.chorniak;

import java.io.Serializable;

public abstract class Entity implements Cloneable, Serializable {
	private int id;

	public Entity() {}

	public Entity(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	};
	

}
