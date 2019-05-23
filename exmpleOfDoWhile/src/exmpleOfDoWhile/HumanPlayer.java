package exmpleOfDoWhile;

import java.awt.TrayIcon.MessageType;

public class HumanPlayer {

	//静态常量
	public static final int MessageTypeFist = 1;
	public static final int MessageTypeWin = 2;
	public static final int MessageTypeLost = 3;
	
	private String name;
	private int score;
	private int fist;
	
	private String[] fistWords = {
			"动感光波～～～",
			"elephone, why your nose is so big?",
			"Beautiy, do you like eat garlic?",
			"Earth is dangers",
			"when moon?"
	        };
	
	private String[] winWords = {
			"win! 动感光波～～～",
			"win! elephone, why your nose is so big?",
			"win! Beautiy, do you like eat garlic?",
			"win! Earth is dangers",
			"win! when moon?"
	};
	private String[] loseWords = {
			"Lost~~~ 动感光波～～～",
			"Lost~~~ elephone, why your nose is so big?",
			"Lost~~~ Beautiy, do you like eat garlic?",
			"Lost~~~ Earth is dangers",
			"Lost~~~  moon?"
	};
	
	public void sendMessage(int msgType) {
		
		int index = ((int)(Math.random() *10000))% 5;
		String message = null;
		switch (msgType) {
		case MessageTypeFist:
			message = fistWords[index];
			break;
		case MessageTypeWin:
			message = winWords[index];
			break;
		case MessageTypeLost:
			message = loseWords[index];
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
