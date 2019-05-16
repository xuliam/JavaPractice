package exmpleOfDoWhile;

import java.util.Scanner;

public class PrintCalendarDemo {

	private static int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static int year = Integer.MIN_VALUE;
	public static int month = Integer.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintCalendar();
		//getSumDayOfYears();
	}

	public static void PrintCalendar() {
		// TODO Auto-generated method stub
		InputYearAndMonth();
		int sum = getSumDayOfYears();
		sum += getSumDayofMonth();
		PrintMonthTitle();
		PrintCalendarContent(sum %7);
		
	}
	private static void PrintCalendarContent(int dayOfWeek) {
		int sepCount = 0;
		if(dayOfWeek == 0) {
			sepCount = 6;			
		}else {
			sepCount = dayOfWeek -1;
		}
		for (int i = 0; i < sepCount; i++) {
			System.out.println("\t");
		}
		for (int i = 0; i < dayOfMonth[month -1]; i++) {
			System.out.print(i+1);
			if((dayOfWeek +i)%7 == 0) {
				System.out.println();
				
			}else {
				System.out.print("\t");
			}
		}
	}
	private static void PrintMonthTitle() {
		String[] monthNames = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		System.out.println(year+ "\t"+ monthNames[month-1]);
		String[] weekends = {"mon","tue","wen","tur","fri","sat","sun"};
		for (int i = 0; i < weekends.length; i++) {
			System.out.print(weekends[i]+"\t");			
		}
		System.out.println();
	}
	private static int getSumDayOfYears() {
		if(year == Integer.MIN_VALUE) {
		    System.out.println("Wrong");
		    InputYearAndMonth();
		}
		int sum = 0;
		 for (int i = 0; i < year; i++) {
			sum += 365;
			if(isLeapYear(i)) {
				sum++;
			}
		}
		return sum;
	}
	private static int getSumDayofMonth() {
		int sum = 0;
		
		for (int i = 0; i < month - 1; i++) {
			sum += dayOfMonth[i];
		}
		if(isLeapYear(year) && month >= 3) {
			sum++;
		}
		return sum;
	}
	private static boolean isLeapYear(int year) {
		return year%400 == 0 || year % 4 == 0 && year % 100 != 0;
	}
	private static void InputYearAndMonth() {
		Scanner input = new Scanner(System.in);
		System.out.println("pls enter the year:");
		 year = input.nextInt();
		 System.out.println("Pls enter the month:");
		 month = input.nextInt();
		 input.close();
		 input = null;
	}

}
