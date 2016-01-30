package org.campus02.figure;

public class Rectangle extends Figure {
	
	private double lenght;
	private double width;

	public Rectangle(double lenght, double width) {
		this.lenght = lenght;
		this.width = width;
	}

	@Override
	public double getPermiter() {
		double permiter = (lenght + width) * 2;
		return permiter;
	}

	@Override
	public double getArea() {
		double area = lenght * width;
		return area;
	}

}
