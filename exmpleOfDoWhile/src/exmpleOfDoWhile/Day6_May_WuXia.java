package exmpleOfDoWhile;

import java.util.Scanner;

public class Day6_May_WuXia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String answer = "Y";
		
		do {
			
			System.out.println("Do you want go on? (Y/N)");
			answer = input.nextLine();	
			
		}while ("Y".equalsIgnoreCase(answer));
		

	}

}
