package exmpleOfDoWhile;

import java.util.Scanner;

public class BinaryAarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] stuNames = {"Mary", "Tony", "Cindy"};
		String[] courseNames = {"English", "Java", "Theory"};
		final int ROW = stuNames.length;
		final int COL = courseNames.length;
		
		double[][] scores = new double[ROW][COL];
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.print(stuNames[i] +"'s"+courseNames[j]+"score :");
				scores[i][j] = input.nextDouble();
			}
		}
		System.out.println();
		
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				scores[i][j]++;
			}
			
		}
		System.out.println(scores);
	}

}
