package ba.bitcamp.vjezbe;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Task1 extends JFrame {

	JSlider s1 = new JSlider(0, 100);
	JLabel l1 = new JLabel("Mladen");
	Font f1;

	public Task1() {

		add(l1);
		l1.setBounds(getHeight() / 2, 100, 400, 100);
		add(s1);
		s1.setMinorTickSpacing(10);
		s1.setMajorTickSpacing(50);
		s1.setPaintTicks(true);
		s1.addChangeListener(new CL());
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Task1();

	}

	public class CL implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			
			f1 = new Font("Serif", Font.PLAIN, s1.getValue());
			l1.setFont(f1);

		}

	}

}
