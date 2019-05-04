package exmpleOfDoWhile;

import java.util.Scanner;

public class KingOfFighter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Pls input the Character Name:");
		String userName = input.next();
		System.out.println(userName + "vs" + "Devil");
		
		int hp1 = 100, hp2 = 100;
		int attack1 = 0, attack2 = 0;
		
		while(hp1 >0 && hp2 > 0) {
			attack1 = (int)(Math.random() *100) %11;
			attack2 = (int)(Math.random() *100) %11;
			
			hp2 -= attack1;
			System.out.println(userName + "use his fist to attack Devil，kill" + attack1 +"blood");
			Thread.sleep(1000);//Stop 1 second for continue next code
			hp1 -= attack2;
			System.out.println("Devil" + "use his dark power to attack" + userName +"unforturnatly"+ userName + "lost" + attack2 +"blood");
			
			
		}
		System.out.println("KO!");
		System.out.println("Name\tBlood");
		System.out.println(userName +"\t"+ hp1);
		System.out.println("Devil" + "\t" + hp2);
		
		
	}
}
