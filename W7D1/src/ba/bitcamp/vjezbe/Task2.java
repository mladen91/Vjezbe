package ba.bitcamp.vjezbe;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Task2 extends JFrame {


	private static final long serialVersionUID = 2830661930132074603L;

    private JPanel panel = new MyPanel();


	public Task2(){
		
		setLayout(new BorderLayout());
		add(panel);
		setSize(500, 500);
		setLocation(550, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	
	public static void main(String[] args) {
		
		new Task2();

	}

	
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = -6302911398550823044L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.RED);
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2d.setStroke(new BasicStroke(10));
			
			g2d.drawLine(0, 0, panel.getWidth(), panel.getHeight());
			g2d.drawLine(0, panel.getHeight(), panel.getWidth(), 0);
		}
	}
}
