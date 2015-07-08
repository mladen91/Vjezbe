package ba.bitcamp.vjezbe;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task6 extends JFrame {

	private static final long serialVersionUID = -422653697499701712L;

	Font[] f = new Font[40];
	JLabel[] l = new JLabel[40];

	public Task6() {

		setLayout(new GridLayout(40, 1));

		for (int i = 0; i < 40; i++) {
			f[i] = new Font("Monospaced", Font.PLAIN, i);
			l[i] = new JLabel("Mladen");
			add(l[i]);
			l[i].setFont(f[i]);
			l[i].setHorizontalAlignment(l[i].CENTER);

		}

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Task6();

	}

}
