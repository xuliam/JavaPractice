package exmpleOfDoWhile;

public class MaxMinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[10];
		for(int i = 0; i< nums.length; i++) {
			nums[i] = ((int)(Math.random()*10000))%1001; //0-1000 random no.
			System.out.print(nums[i]+ "\t");
			
		}
		System.out.println();//change line
		int max = nums[0];
		int min = nums[0];
		for( int i =0; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
			if(nums[i] < min) {
				min = nums[i];
			}
			
		}
		System.out.println(max);
		System.out.println(min);
	}

}
