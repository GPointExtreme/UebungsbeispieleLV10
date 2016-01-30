package org.campus02.land;

public class Demo {

	public static void main(String[] args) {
		
		Bundesland steiermark = new Bundesland(1000.0);
		Bundesland wien = new Bundesland(2000.0);
		
		Bundesstaat oesterreich = new Bundesstaat();
		
		oesterreich.addLand(steiermark);
		oesterreich.addLand(wien);
		
		System.out.println(oesterreich.getBruttoSozialProdukt());

	}

}
