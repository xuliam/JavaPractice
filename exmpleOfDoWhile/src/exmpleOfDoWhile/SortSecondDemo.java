package exmpleOfDoWhile;

import java.util.Arrays;

public class SortSecondDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[10];
		int[] nums2 = new int[10];
		for (int i = 0; i < nums.length; i++) {
		 nums[i] = (int)(Math.random()*100);
		 System.out.print(nums[i]+"\t");
		 nums2[i]= nums[i];
		}
		
		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			int min = nums[i];
			int minIndex = i;
			for (int j = i+1; j < nums.length; j++) {
				if (min > nums[j]) {
					min = nums[j];
					minIndex = j;
				}
			}
			int temp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = temp;
			System.out.print(nums[i]+"\t");
		}
		
		}
	}


