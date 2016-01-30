package org.campus02.land;

public class Bundesland extends land {
	
	private double bruttoSozialProdukt;

	public Bundesland(double bruttoSozialProdukt) {
		this.bruttoSozialProdukt = bruttoSozialProdukt;
	}

	@Override
	public double getBruttoSozialProdukt() {
		return bruttoSozialProdukt;
	}

}
