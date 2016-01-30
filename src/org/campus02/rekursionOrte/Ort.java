package org.campus02.rekursionOrte;

import java.util.ArrayList;

public class Ort {
	
	protected String name;
	protected ArrayList<Ort> nachbarn = new ArrayList<>();

	public Ort(String name) {
		super();
		this.name = name;
	}
	
	public void addNachbar(Ort o) {
		nachbarn.add(o);
	}
	
	

}
