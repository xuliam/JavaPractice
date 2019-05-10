package exmpleOfDoWhile;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = new int[20];
		nums[0] = 0;
		nums[1] = 1;
		int sum = 0;
		int avg;
		for(int i = 2; i < nums.length; i++) {
			nums[i] = nums[i-1] + nums[i-2];
			
		}
		System.out.println("The Result");
		
		for(int i = 0; i< nums.length; i++ ) {
			System.out.print(nums[i]+",");
			sum += nums[i];
		}
		System.out.println();//print change next line
		System.out.println(sum/nums.length);
	}
   
}
