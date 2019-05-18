package exmpleOfDoWhile;

import java.util.Scanner;

public class WeekDayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the day of week:");
		Scanner input = new Scanner(System.in);
		int dayOfWeek = input.nextInt();
		ShowDayOfWeek(dayOfWeek);
	}
	
	private static boolean isAvalible(int dayOfWeek) {
		if(dayOfWeek <1 || dayOfWeek >7) {			
			return false;
		}
		return true;
	}
	public static void ShowDayOfWeek(int dayOfWeek) {
		if(!isAvalible(dayOfWeek)) {
			System.out.println("System must enter 1 to 7 ");
			return;
		}
		String[] Weekday = {"Monday", "Tuesday", "Wendesday","Thuresday","Friday", "Saturday", "Sunday"};
		System.out.println(Weekday[dayOfWeek-1]);
	}

}
