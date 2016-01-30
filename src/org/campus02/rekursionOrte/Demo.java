package org.campus02.rekursionOrte;

public class Demo {

	public static void main(String[] args) {
		
		Ort graz = new Ort("graz");
		Ort wien = new Ort("wien");	
		Ort	marburg	= 	new	Ort("marburg");
		Ort linz = new Ort ("linz");
		
		graz.addNachbar(marburg);
		graz.addNachbar(wien);
		
		wien.addNachbar(linz);
		
		linz.addNachbar(graz);
		marburg.addNachbar(graz);
		wien.addNachbar(graz);
		linz.addNachbar(wien);
		
		System.out.println(hasCircle(graz, graz, graz, 0));

	}
	
	public static boolean hasCircle(Ort startZiel, Ort current, Ort last, int counter) {
		for (Ort ort : current.nachbarn) {
			counter++;
			System.out.println(current.name + " -> " + ort.name + " " + counter);
			if (ort == last) {
				continue;
			}
			if (ort == startZiel) {
				return true;
			}
			if (hasCircle(startZiel, ort, current, counter)) {
				return true;
			}
		}
		return false;
	}

}
