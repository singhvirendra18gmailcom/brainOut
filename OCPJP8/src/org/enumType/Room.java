package org.enumType;

public enum Room {
	BR("10");
	private Room(String sq) {
		this.sqft = sq;

	}

	private String sqft;

	public String getSqt() {
		return this.sqft;
	}
}