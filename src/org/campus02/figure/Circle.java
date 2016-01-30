package org.campus02.figure;

public class Circle extends Figure {
	
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getPermiter() {
		double permiter = 2 * radius * Math.PI;
		return permiter;
	}

	@Override
	public double getArea() {
		double area = (radius * radius) * Math.PI;
		return area;
	}

}
