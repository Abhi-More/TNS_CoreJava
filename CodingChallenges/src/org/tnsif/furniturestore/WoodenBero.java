package org.tnsif.furniturestore;

public class WoodenBero extends Bero{
	private String woodType;

	
	public WoodenBero(String beroType, String beroColour, String woodType) {
		super(beroType, beroColour);
		this.woodType = woodType;
	}

	public String getWoodType() {
		return woodType;
	}

	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}

	@Override
	public void calculatePrice() {
		if(woodType.equals("Ply Wood"))
			this.price = 15000;
		else if(woodType.equals("Teak Wood"))
			this.price = 12000;
		else if(woodType.equals("Engineered Wood"))
			this.price = 10000;
	}
	
}
