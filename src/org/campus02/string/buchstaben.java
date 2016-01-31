package org.campus02.string;

public class buchstaben {

	public static void main(String[] args) {
		String satz = "wörter starten mit großbuchstaben";
		
		System.out.println(Umwandler(satz));
		

	}
	
	public static String Umwandler(String satz) {
		String ausgabe = "";
		for (int i = 0; i < satz.length(); i++) {
			if (i == 0) {
				ausgabe += Character.toUpperCase(satz.charAt(i));
				i++;
			}
			if (satz.charAt(i) == ' ') {
				ausgabe += " " + Character.toUpperCase(satz.charAt(i + 1));
				i++;
			}
			else {
				ausgabe += satz.charAt(i);
			}
		}
		return ausgabe;
	}

}
