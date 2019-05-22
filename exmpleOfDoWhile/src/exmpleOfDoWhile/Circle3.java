package exmpleOfDoWhile;

public class Circle3 {

	private double radius;
	private double perimeter;
	private double area;
	
	public void show() {
		System.out.println(this.getPerimeter());
		System.out.println(this.getArea());
	}
	public Circle3(double radius) {
		this.radius = radius;
	}

	//public Circle3() {
		// TODO Auto-generated constructor stub
	//}

	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPerimeter() {
		perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	public double getArea() {
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}


	
	
}
