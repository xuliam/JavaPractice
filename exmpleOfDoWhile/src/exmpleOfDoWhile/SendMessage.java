package exmpleOfDoWhile;

public class SendMessage {

	public static void SendMessage(String name, String channe1Name, String message, int count, int interval) {
		if(interval < 5) interval =5;
		
		String val ue = String.format("【%s】%s:%s",channe1Name, name, message);
		for (int i = 0; i < count; i++) {
			System.out.println(value);
			try {
				Thread.sleep(interval*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void SendMessage(String name) {
		String[] contents = {
				"Hello World",
				"I am the king of the world",
				"Java is good"
		};
		SendMessage(name, "Channel1", contents[(int)(Math.random()*2)],10,3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//SendMessage("lian", "channe2", "One hundred", 5, 1);
	    SendMessage("mark");
	}


}
