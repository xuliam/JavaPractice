package exmpleOfDoWhile;

import java.util.Scanner;

public class ParamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		paramTest("lianxu",1,2,3,4,5);
		
	/*	String[] couseNames = {"Mark1","Mark2","Mark3"};
	
		
		final int col = couseNames.length;
	
		int N = 3;
		String[] names = new String[N];
		final int row = names.length;
		
		int[][] nums = new int[row][col];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < row; i++) {
		    System.out.println("pls enter name:");
		    names[i] = input.nextLine();
			for (int j = 0; j < col; j++) {
				System.out.println(names[i]+couseNames[j]+"Score:");
				nums[i][j]= new Scanner(System.in).nextInt();
			}
		}
	} */

	private static void paramTest(String names, int...nums, int num2, int num3) {
		// TODO Auto-generated method stub
		System.out.print("first param:" + names);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}

}
