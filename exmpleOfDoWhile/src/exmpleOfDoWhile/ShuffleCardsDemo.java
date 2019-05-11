package exmpleOfDoWhile;

public class ShuffleCardsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int N = 52;
		int nums[] = new int[N];
		String[] cardColors = {"blac","hear","diam","spad"};
		String[] cardValues = {"A", "2", "3","4","5","6","7","8","9","10",
				"J", "Q","K"};
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
		}
		 
		System.out.println("before Shuffle");
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%s-%s", cardColors[nums[i]/13],cardValues[nums[i]%13]);
			if((i+1)%13 == 0) {
				System.out.println();							
			}else {
				System.out.print("\t");
			}
		}
		for (int i = 0; i < nums.length; i++) {
			int newIndex;
			 newIndex = (int)(Math.random()* nums.length);//generate 0-51 no.
			int temp = nums[i];
			nums [i] = nums [newIndex];
			nums[newIndex] = temp;
		}
		
		System.out.println("After Shuffle:");
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%s-%s", cardColors[nums[i]/13],cardValues[nums[i]%13]);
			if ((i+1) %13 == 0) {
				System.out.println();
			}else {
				System.out.print("\t");
				}
			}
	}

}
