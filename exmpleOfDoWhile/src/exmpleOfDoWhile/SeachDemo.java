package exmpleOfDoWhile;

import java.util.Scanner;

public class SeachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("These is the array:");
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int)(Math.random()*10000))%1001;
			System.out.print(nums[i]+",");
		}
		System.out.println();
		
		System.out.println("Pls enter the No. which you want to search:");
		Scanner input = new Scanner(System.in);
		int searchNum = input.nextInt();
		int searchIndex = -1;
		
		for (int i = 0; i < nums.length; i++) {
			if (searchNum == nums[i] ) {
				searchIndex = i;
				break;
			}
			
		}
		if (searchIndex == -1) {
			System.out.println("It is pity, We can not find the No.");
		} else {
			System.out.println("You made it"+ searchIndex);
		}
	}

}
