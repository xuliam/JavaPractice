package exmpleOfDoWhile;

import java.util.Scanner;

public class MoneyTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		double money = Double.MAX_VALUE;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("pls enter No."+(i+1)+"player money:");
			money = input.nextDouble();
			if(money >= 500) {
				sum += money;
			}
		}
		System.out.println(sum);
	}

}
