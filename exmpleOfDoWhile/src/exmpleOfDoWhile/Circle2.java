package exmpleOfDoWhile;

import java.util.Scanner;

public class Circle2 {

	public double radius;
	public double perimeter;
	public double area;
	
	public Circle2() {
		inputRadius();
	}
	
	public Circle2(double radius1) {
		//if(radius1>0) {
			radius = radius1;
		//}else {
		//	inputRadius();
		//}
		
	}
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
