package exmpleOfDoWhile;

public class HumanPlayer1 {

	public static final int MessageTypeFist = 1;
	public static final int MessageTypeWin =2;
	public static final int MessageTypeLost =3;
	
	
	private String name;
	private int score;
	private int fist;
	
	
	public String[] fistWords = {
			"Fist, Love you!",
			"Fist, When MOON!",
			"Fist, 100 times, 100 times!",
			"Fist, Elephone, Elephone, Why your nose is so long?",
			"Fist, Dream Big, Fear, Less."
	};
	
	public String[] winWords = {
			"Win~~~, Love you!",
			"Win~~~, When MOON!",
			"Win~~~, 100 times, 100 times!",
			"Win~~~, Elephone, Elephone, Why your nose is so long?",
			"Win~~~, Dream Big, Fear, Less."
	};
	
	public String[] lostWords = {
			"~~~YaMedei~~~, Love you!",
			"~~~YaMedei~~~, When MOON!",
			"~~~YaMedei~~~, 100 times, 100 times!",
			"~~~YaMedei~~~, Elephone, Elephone, Why your nose is so long?",
			"~~~YaMedei~~~, Dream Big, Fear, Less."
	};
	
	public void sendMessage(int messageType) {
		int index = ((int)(Math.random()*1000))%5;
		String message = null;
		switch (messageType) {
		case MessageTypeFist:
			message = fistWords[index];
			break;
		case MessageTypeWin:
			message = winWords[index];
			
			break;
		case MessageTypeLost:
			message = lostWords[index];
			break;
		}
		System.out.println(message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getFist() {
		return fist;
	}

	public void setFist(int fist) {
		this.fist = fist;
	}
	
	
}
