package exmpleOfDoWhile;

public class SumTools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 1; i < 367; i++) {
			for (int f = 1; f < 367; f++) {
				for (int k = 1; k < 367; k++) {
					int m = 370- i - f - k;
					if (i + 10 == f - 20 && f - 20 == k * 2 && k * 2 == m / 2 && i+f+k+m ==370) 
						System.out.printf("The number of those 4 people is : %-4d%-5d%-4d%-4d",i,f,k,m);
					
					
				}
			}
			
		}
		
	}
}
