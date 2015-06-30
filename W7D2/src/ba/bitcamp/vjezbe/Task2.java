package ba.bitcamp.vjezbe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task2 extends JFrame {

	JLabel l1 = new JLabel();
	String s = "";

	public Task2() {
		addKeyListener(new KL());
		add(l1);
		l1.setHorizontalAlignment(JLabel.CENTER);
		setLocation(400, 300);
		setSize(500, 500);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Task2();
	}

	public class KL implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {

		}

		@Override
		public void keyPressed(KeyEvent e) {
			
			
			if (e.getKeyCode()==KeyEvent.VK_BACK_SPACE){
				if(s.length()==0){
				s="";	
				}else{
				s=s.substring(0, s.length()-1);
				l1.setText(s);
				}
			}else {
				s += e.getKeyChar();
			l1.setText(s);
			}

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}
	
	
	
	
}
