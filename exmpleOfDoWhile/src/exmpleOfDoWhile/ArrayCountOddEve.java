package exmpleOfDoWhile;

public class ArrayCountOddEve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int)(Math.random()*10000))%1001;
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
		
		int odd = 0, eve = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 ==0) {
				eve++;				
			} else {
				odd++;
			}
		}
		System.out.println(eve+"\n"+odd);
	
		
	}

}
