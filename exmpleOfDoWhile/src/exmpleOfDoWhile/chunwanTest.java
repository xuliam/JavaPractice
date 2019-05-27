package exmpleOfDoWhile;

public class chunwanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Director zhang = new Director();
		
		Singer lian = new Singer("连旭");
		
		Actor wu = new Actor("wu Zhongxian");
		
		zhang.action(lian);
		zhang.action(wu);
	}

}
