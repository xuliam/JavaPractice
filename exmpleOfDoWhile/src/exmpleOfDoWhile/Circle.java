package exmpleOfDoWhile;

import java.util.Scanner;

public class Circle {

	public double radius;
	public double perimeter;
	public double area;
	
	public void inputRadius(){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the radius:");
		radius = input.nextDouble();
		input.close();
	}
	
	public void showPerimeter() {
		if(radius <=0) {
			inputRadius();
		}
		perimeter = 2* Math.PI* radius;
		System.out.println("Perimeter is"+ perimeter);
	}
	
	public void showArea() {
		if(radius <=0) {
			inputRadius();
		}
		area = Math.PI* Math.pow(radius, 2);
		System.out.println("area:"+area);
	}
}
