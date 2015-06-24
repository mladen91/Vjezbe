package ba.bitcamp.vjezbe.task5;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main5 extends JFrame{

	private JLabel l1 = new JLabel("_xample Sentence");
	private JButton bLeft = new JButton("<");
	private JButton bRight = new JButton(">");
	private JButton bDown = new JButton("Remove");
	
	public Main5(){
		setVisible(true);
		add(l1);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		add(bLeft, BorderLayout.WEST);
		add(bRight, BorderLayout.EAST);
		add(bDown, BorderLayout.SOUTH);
		l1.setFont(new Font("Serif", Font.BOLD, 18));
		setTitle("Task 4");
		setSize(350, 200);
		setLocation(700, 350);
		setDefaultCloseOperation(3);
	}
	
	public static void main(String[] args) {
		new Main5();

	}
	
	public class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource()==bRight) {
				l1.setText("I told you not to press it!");
				
			}
				

		}

	}

}
