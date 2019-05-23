package exmpleOfDoWhile;

import java.util.Scanner;

public class GameRoom {

	private HumanPlayer player1 = null;
	private ComPlayer player2 = null;
	private int roomId;
	private String roomName;
	private String roomPass;

	public GameRoom() {
		initGame();
	    startGame();
		endGame();
	}

	public void initGame() {

		player1 = new HumanPlayer();
		player2 = new ComPlayer();
		for (int i = 0; i < 30; i++) {
			System.out.print("*");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println();
		System.out.println("Loading Completed!");
	}

	public void startGame() {
		showMenu();
		choicRole();
		System.out.println(player1.getName()+"pls shoot");
		player1.setFist(new Scanner(System.in).nextInt());
		int fist1 = player1.getFist();
        player2.getFist();
        int fist2 = player2.getFist();
        int result = judge(fist1, fist2);
        if(result == -1) {
        	player1.sendMessage(HumanPlayer.MessageTypeWin);
        	player2.sendMessage(ComPlayer.MessageTypeLost);
        }else if (result == 0) {
        	player1.sendMessage(HumanPlayer.MessageTypeFist);
        	player2.sendMessage(ComPlayer.MessageTypeFist);
        }else {
        	player2.sendMessage(ComPlayer.MessageTypeWin);
        	player1.sendMessage(HumanPlayer.MessageTypeLost);
        }
	}

	public void showMenu() {
		System.out.println("Welcome to out world");
		System.out.println("1 - Sessors; 2 - Hand ; 3 - Stone");

	}

	public void choicRole() {
		System.out.println("Choose charicter 1. stupid 2 mark 3 janny 4 kivi");
		System.out.println("ple choose:");
		int choice = new Scanner(System.in).nextInt();
		String[] nameArray = {"Stupid", "Mark", "Janny", "Kivi"};
		player2.setName(nameArray[choice -1]);
		player1.setName("Lian");
		System.out.println(player1.getName()+"  VS. "+ player2.getName());
		
	}

	public void endGame() {
		System.out.println("88");

	}

	public int judge(int fist1, int fist2) {
		if(fist1 == fist2) return 0;
		if(fist1 == 1&& fist2 == 3|| fist1==2 && fist2 ==1 || fist1 ==3 && fist2 == 2) {
			player1.setScore(player1.getScore()+1);
			player2.setScore(player2.getScore()-1);
			return -1;
		}
		player1.setScore(player1.getScore()-1);
		player2.setScore(player2.getScore()+1);

		return 1;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomPass() {
		return roomPass;
	}

	public void setRoomPass(String roomPass) {
		this.roomPass = roomPass;
	}

}
