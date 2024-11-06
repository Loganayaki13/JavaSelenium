package javaOops;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		Circle c = new Circle(3.14, input.nextDouble());
		System.out.println("Circumference  : " + c.calc());

	}

	static double pi;
	static double radius;

	public Circle() {
		this.radius = 5.0;
		this.pi = 3.14;

	}

	public Circle(double pi, double radius) {
		this.pi = pi;
		this.radius = radius;

	}

	public double calc() {

		return 2 * pi * radius;
	}

}
