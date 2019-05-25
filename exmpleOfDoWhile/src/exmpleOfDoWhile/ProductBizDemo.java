package exmpleOfDoWhile;

import java.util.Scanner;

public class ProductBizDemo {

	public static void main(String[] args) {
		
		double total = 0;
		Scanner input = new Scanner(System.in);
		
		Product[] products = new Product[3];
		for (int i = 0; i < products.length; i++) {
			products[i] = new Product();
			
			System.out.println("pls enter the name:");
			String name = input.next();
			products[i].setName(name);
			
			System.out.println("pls price:");
			double price = input.nextDouble();
			products[i].setPrice(price);
			
			System.out.println("count:");
			int count = input.nextInt();
			products[i].setCount(count);
			total += products[i].getPrice() * products[i].getCount();
		} 
		System.out.println("Detail Sum");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getName()+"\t\t\t\t"+products[i].getPrice()+"\t\t\t\t"+products[i].getCount());
		}
		System.out.println(total);
	}
}
