package dev.riddle.fixture;

public abstract class Fixture {
	
	public Fixture() {}
	
	protected String name;
	protected String longDescription;
	protected String shortDescription;

	public Fixture(String name, String longDescription, String shortDescription) {
		
		this.name = name;
		this.longDescription = longDescription;
		this.shortDescription = shortDescription;
		
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLongDescription() {
		return this.longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getShortDescription() {
		return this.shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	@Override
	public String toString() {
		return "Fixture [name=" + name + ", shortDescription=" + shortDescription + ", longDescription="
				+ longDescription + "]";
	}
	
	
	

}
