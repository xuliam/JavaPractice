package exmpleOfDoWhile;

public class Singer extends Actor {

	public Singer() {
		super();
	}
	
	public Singer(String name) {
		super(name);
	}

	@Override
	public void performs() {
		System.out.println("The singer" + getName() +"is performing his song");
	}

}
