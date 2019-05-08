package exmpleOfDoWhile;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		final int num = 5000;
		int guessNum = 0;
		String prizeName = null;
		int times =0;
		for(int i = 0; i < 5; i++) {
			System.out.println("pls enter your guess price:");
			guessNum = input.nextInt();
			times++;
			if(guessNum == num) {
				if(times==1) {
					System.out.println("Good Job, you get the prize!");
					prizeName = "Iphone10X";
				}else if(times==2){
					prizeName = "Apple Watch";
				}else {
					prizeName = "Apple pencil";
				}
		    	break;
				
			}else if(guessNum > num) {
				System.out.println("Your num is big");				
			}else {
				System.out.println("Your num is small");				
			}
			
		}
		
		
		if (null == prizeName) {
			System.out.println("It's pitty, better next time");
		}else {
			System.out.println("Congratulations!");
			System.out.println(prizeName);
		}
	}

}
