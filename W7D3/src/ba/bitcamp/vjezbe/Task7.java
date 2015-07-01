package ba.bitcamp.vjezbe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task7  extends JPanel {
int x = 0;
int y = 0;
	public Task7(){
		 JFrame window = new JFrame("Out little program");
	     window.add(this);
		 window.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				x=e.getX();
				y=e.getY();
				
			}
		});
	     window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     window.setVisible(true);
	     window.setSize(500, 500);
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
			g.setColor(Color.BLACK);
			g.fillOval(x, y, 150, 150);
			repaint();	
	}
	
	
	public static void main(String[] args) {
		new Task7();
		

		

	}
	
	

}
