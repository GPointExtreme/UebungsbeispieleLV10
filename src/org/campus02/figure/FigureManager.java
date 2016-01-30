package org.campus02.figure;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
	
	ArrayList<Figure> list = new ArrayList<>();
	
	public void add(Figure f) {
		list.add(f);
	}
	
	public double getMaxPermiter() {
		double max = 0.0;
		for (Figure figure : list) {
			if(figure.getPermiter() > max) {
				max = figure.getPermiter();
			}
		}
		return max;
	}
	
	public double getAverangeAreaSize() {
		double summe = 0.0;
		for (Figure figure : list) {
			summe += figure.getArea();
		}
		return summe/list.size();
	}
	
	public HashMap<String, Double> getAreaBySizeCategories() {
		HashMap<String, Double> map = new HashMap<>();
		map.put("Klein", 0.0);
		map.put("Mittel", 0.0);
		map.put("Groﬂ", 0.0);
		
		for (Figure figure : list) {
			if(figure.getArea() < 1000.0) {
				Double value = map.get("Klein");
				map.put("Klein", value + figure.getArea());
			}
			if(figure.getArea() >= 1000.0 && figure.getArea() < 5000.0) {
				Double value = map.get("Mittel");
				map.put("Mittel", value + figure.getArea());
			}
			if(figure.getArea() >= 5000.0) {
				Double value = map.get("Groﬂ");
				map.put("Groﬂ", value + figure.getArea());
			}
		}
		return map;
	}
}
