package ba.bitcamp.vjezbe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Task4 extends JFrame {

	JLabel l1 = new JLabel("Get Ready");
	String s = "";
	int a = (int) (Math.random() * 100 + 1);
	int delayIncrease = 0;
	long start =System.currentTimeMillis();
	long end =System.currentTimeMillis();
	long sum;
	Timer t1;

	public Task4() {

		t1 = new Timer(50, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
                
				

				t1.setDelay(delayIncrease++);
				if (t1.getDelay() == a) {

					l1.setText("Press a key now!");
					t1.stop();
					start=System.currentTimeMillis();

				}

			}
		});

		add(l1);
		l1.setHorizontalAlignment(JLabel.CENTER);
		setLocation(400, 300);
		setSize(500, 500);
        addKeyListener(new KL());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		t1.start();
	}

	public static void main(String[] args) {

		new Task4();
	}
	
	public class KL implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {

		}

		@Override
		public void keyPressed(KeyEvent e) {
			
			
				end =System.currentTimeMillis();
				sum=end-start;
				l1.setText(Double.toString(sum));
				
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}

}
