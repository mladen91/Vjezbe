package ba.bitcamp.predavanja;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloWorldGUI2 {

	public static class HelloWorldDisplay extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("Tic Tac Toe", 85, 30);
		}
	}

	private static class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
	
		}
	}
	
	public static class BH2 implements ActionListener {
		JButton jb;
		
		public BH2(JButton jb) {
			super();
			this.jb = jb;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			String str = jb.getText();
			if (str.equals("X")) {
				jb.setText("O");
			}else {
				jb.setText("X");
			}
			
		}
				
	}
	
	public static void main(String[] args) {

		GridLayout experimentLayout = new GridLayout(3,3);
		HelloWorldDisplay displayPanel = new HelloWorldDisplay();
		JButton okButton = new JButton("X");
		ButtonHandler listener = new ButtonHandler();
		okButton.addActionListener(listener);
		
		okButton.addActionListener(new BH2(okButton));

		JPanel content = new JPanel();
		content.setLayout(experimentLayout);
		content.add(displayPanel, experimentLayout);
		content.add(okButton, experimentLayout);

		JFrame window = new JFrame("GUI Test");
		window.setContentPane(content);
		window.setSize(250, 100);
		window.setLocation(100, 100);
		window.setVisible(true);
		
		
	}
}
