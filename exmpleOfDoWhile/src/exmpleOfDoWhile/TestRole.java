package exmpleOfDoWhile;

public class TestRole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Role character1 = new Role();
		character1.name = "劳拉";
		character1.level = 25;
		character1.job = "doctor";
		character1.doSkill();
		character1.show();
		
		Role character2 = new Role();
		character2.name = "maik";
		character2.level = 25;
		character2.job = "doctor";
		character2.doSkill();
		character2.show();
	}

}
