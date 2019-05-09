package exmpleOfDoWhile;

public class OneToFiveHungerdHave4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		for(int i =1; i < 501; i++) {
			int a = i % 10;
			int b = i / 10 % 10;
			int c = i / 100;
			if (a == 4 || b== 4 || c==4) {
				continue;
			}
			 count++;
		}
		System.out.println(count);
		int x = 523;
		int y = x % 100;
		System.out.println(y);

	}

}

