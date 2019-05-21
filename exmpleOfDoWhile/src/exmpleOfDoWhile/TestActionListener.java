package exmpleOfDoWhile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class TestActionListener extends JFrame implements ActionListener {
	
	private JButton jbtOk = new JButton("ok");
	private JButton jbtCancel = new JButton("cancel");
	
	public TestActionListener() {
		setTitle("testActionListener");
		
		getContentPane().setLayout(new FlowLayout());
		
		getContentPane().add(jbtOk);
		getContentPane().add(jbtCancel);
		
		jbtOk.addActionListener(this);
		jbtCancel.addActionListener(this);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestActionListener frame = new TestActionListener();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100,80);
		frame.setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == jbtOk) {
			System.out.println("The OK button is clicked");
			
		}else if(e.getSource() == jbtCancel) {
			System.out.println("The cancel button is clicked");
		}
	}
}
