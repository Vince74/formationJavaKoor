package fr.vsoul.programme;

public abstract class Fruits {

	private String name;
	
	public Fruits() {
	}

	public abstract void taste();
	
	public abstract int getSize();
	
	public abstract boolean hasSeed();
	
	public void miam() {
		System.out.println("Mangez 5 fruits et légumes par jour.");
	}
	
	public String getName() {
		return this.name;
	}
}