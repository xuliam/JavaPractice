package exmpleOfDoWhile;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFramDemo extends JFrame {

	private static Component frame;
	public JFamDemo() {
		setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		
		add(new JLabel("First Name"));
		add(new JTexField(8));
		add(new JLable("ML"));
		add(new JTextField(i));
		add(new JLabel("Last Name"));
		add(new JTextField(8));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFamDemo fram = new JFamDemo();
		
		frame.add(jbtOK);
		
		frame.setSize(400,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
