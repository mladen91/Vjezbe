package ba.bitcamp.predavanja;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;



public class Timer1 extends JFrame {

	private static final long serialVersionUID = 6496469951134322837L;
	
	String s = "0";
	int counter=0;
	JPanel panel = new MyPanel();
	Font f1 = new Font("Monospaced", Font.PLAIN, 20);

	public Timer1() {
		
		setLayout(new BorderLayout());
		add(panel);
		panel.setFont(f1);
		setSize(500, 500);
		
		setLocationRelativeTo(null);
	
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Timer t1 = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				s = ""+counter;
				counter++;
				repaint();
				
			}
		});
		
		t1.start();
				
		
		
	}

	public static void main(String[] args) {
		new Timer1();
		
	
		

	}

	private class MyPanel extends JPanel {
		private static final long serialVersionUID = -6302911398550823044L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.RED);
			g2d.drawString(s, 150, 150);

			

		}
	}

//	public class MH implements MouseMotionListener, MouseListener {
//
//		@Override
//		public void mouseDragged(MouseEvent e) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public void mouseMoved(MouseEvent e) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public void mouseClicked(MouseEvent e) {
//
//			if (e.getButton() == MouseEvent.BUTTON1) {
//				s = ""+counter;
//				counter++;
//				repaint();
//			}
//
//		}
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public void mouseReleased(MouseEvent e) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public void mouseEntered(MouseEvent e) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public void mouseExited(MouseEvent e) {
//			// TODO Auto-generated method stub
//
//		}
//	}

}
