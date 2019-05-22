package exmpleOfDoWhile;

import java.util.Scanner;

public class Circle {

	public double radius;
	public double perimeter;
	public double area;
	
	public void inputRadius() {
	Scanner input = new Scanner(System.in);
    System.out.println("PLs enter the radius:");
    radius = input.nextDouble();
    input.close();
	}
	
	public void showPerimeter() {
		perimeter = 2* Math.PI * radius;
		System.out.println(perimeter);
	}
	public void showArea() {
		area = Math.PI * Math.pow(radius, 2);
		System.out.println(area);;
	}
}
