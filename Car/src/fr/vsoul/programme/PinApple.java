package fr.vsoul.programme;

public class PinApple extends Fruits {

	@Override
	public void taste() {
		System.out.println("L'ananas a un gout un peu acide");

	}

	@Override
	public int getSize() {
		return 3;
	}

	@Override
	public boolean hasSeed() {
		return true;
	}

}
