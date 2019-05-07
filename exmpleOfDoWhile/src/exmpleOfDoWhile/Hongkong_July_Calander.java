package exmpleOfDoWhile;

public class Hongkong_July_Calander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Mon\tTue\tWed\tThr\tFri\tSat\tSun");
		System.out.print("\t");
		
		for (int i = 0; i <= 30; i++) {
			System.out.print(i+1);
			
			if((i+2)%7==0) {
				System.out.print("\n");
				
			}
			else {
				System.out.print("\t");
			}
		}
		
	}

}
