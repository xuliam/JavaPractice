package exmpleOfDoWhile;

import java.util.Scanner;

public class UseArrayToAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		double[] scores = new double[10];
		double avg, sum =0;
		for(int i = 0; i < scores.length; i++) {
			System.out.println("pls enter "+ (i +1) +"\t"+"student score:");
			scores[i] = input.nextDouble();
		}
		for(int i = 0; i < scores.length; i++) {
	    sum += scores[i];
		}
		//System.out.println(sum);
		System.out.printf("%dstudent avage score:%.2f", scores.length, sum/scores.length );
	}

}
