package exmpleOfDoWhile;

import java.util.Scanner;

public class Power_Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int power = 0;
		int sum = 0;
		double avg = 0;
		for(int i = 0; i<3 ; i++) {
			System.out.println("pls enter "+i+"the power:");
			power = input.nextInt();
			sum += power;
		}
			avg = sum/3;
			System.out.println(avg);
	}

}
