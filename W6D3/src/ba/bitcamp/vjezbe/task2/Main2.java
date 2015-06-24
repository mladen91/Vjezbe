package ba.bitcamp.vjezbe.task2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;



public class Main2 extends JFrame {

	JFrame window = new JFrame();
	//form 1 
	private JLabel l1 = new JLabel("Hello World");
	private JButton b1 = new JButton("Hello!");
	//form 2
	private JLabel hello = new JLabel ("Hello!");
	private JButton b2 = new JButton ("OK");

	public Main2() {
		setVisible(true);
		add(l1);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		add(b1, BorderLayout.SOUTH);
		setTitle("Task1");
		setSize(400, 300);
		setLocation(700, 350);
		setDefaultCloseOperation(3);
		ButtonHandler listener = new ButtonHandler();
		b1.addActionListener(listener);
	}
	


	public static void main(String[] args) {

		new Main2();

	}

	public void ActionPerformed(ActionEvent e) {
		System.exit(EXIT_ON_CLOSE);
	}
	
	
	private static class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Hello!");
			System.exit(3);
		}
	}

}
