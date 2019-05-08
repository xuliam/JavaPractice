package exmpleOfDoWhile;

import java.util.Scanner;

public class UseBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int exp = 0;
		int sum = 0;
		
		for(;;) {  //dead loop
			System.out.print("Pls enter your No. of Exp:");
			exp = input.nextInt();
			
			if (exp <= 0) {
				System.out.print("You are useless, byebye.");
				break;
			}
			sum += exp;
			
		}
		
		System.out.println(sum);
	}

}
