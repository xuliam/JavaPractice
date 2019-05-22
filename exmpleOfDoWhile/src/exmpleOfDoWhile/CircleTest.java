package exmpleOfDoWhile;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Circle2 yuan = new Circle2(10);
		//yuan.inputRadius();
		//yuan.showPerimeter();
	//	yuan.showArea();
		
		Scanner input = new Scanner(System.in);
		System.out.println("radius:");
		double radius = input.nextDouble();
		Circle3 yuan = new Circle3(radius);
		yuan.show();
		
		}

}
