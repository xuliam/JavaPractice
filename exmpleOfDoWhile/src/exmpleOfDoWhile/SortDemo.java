package exmpleOfDoWhile;

public class SortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[1000];
		for (int i = 0; i < nums.length; i++) {
			nums[i]= ((int)(Math.random()*10000))%1001;
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length-1; j++) {
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j] =nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		System.out.println("the result:");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+"\t");
			
		}
	}

}
