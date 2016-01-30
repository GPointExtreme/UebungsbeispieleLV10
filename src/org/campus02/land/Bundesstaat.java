package org.campus02.land;

import java.util.ArrayList;

public class Bundesstaat extends land {
	
	private ArrayList<land> laender = new ArrayList<>();

	public Bundesstaat() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBruttoSozialProdukt() {
		double summe = 0.0;
		for (land l : laender) {
			summe += l.getBruttoSozialProdukt();
		}
		return summe;
	}
	
	public void addLand(land l) {
		laender.add(l);
	}

}
