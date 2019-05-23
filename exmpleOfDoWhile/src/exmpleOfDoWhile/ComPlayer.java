package exmpleOfDoWhile;

import java.awt.TrayIcon.MessageType;

public class ComPlayer {

	//静态常量
	public static final int MessageTypeFist = 1;
	public static final int MessageTypeWin = 2;
	public static final int MessageTypeLost = 3;
	
	private String name;
	private int score;
	private int fist;
	
	private String[] fistWords = {
			"ROBOT：动感光波～～～",
			"ROBOT：elephone, why your nose is so big?",
			"ROBOT：Beautiy, do you like eat garlic?",
			"ROBOT：Earth is dangers",
			"ROBOT：when moon?"
	        };
	
	private String[] winWords = {
			"ROBOT：win! 动感光波～～～",
			"ROBOT：win! elephone, why your nose is so big?",
			"ROBOT：win! Beautiy, do you like eat garlic?",
			"ROBOT：win! Earth is dangers",
			"ROBOT：win! when moon?"
	};
	private String[] loseWords = {
			"ROBOT：Lost~~~ 动感光波～～～",
			"ROBOT：Lost~~~ elephone, why your nose is so big?",
			"ROBOT：Lost~~~ Beautiy, do you like eat garlic?",
			"ROBOT：Lost~~~ Earth is dangers",
			"ROBOT：Lost~~~  moon?"
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
		fist = ((int)(Math.random()*10000))% 3 +1;
		return fist;
	}
	
}
