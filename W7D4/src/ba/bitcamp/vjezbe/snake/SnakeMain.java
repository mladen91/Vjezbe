package ba.bitcamp.vjezbe.snake;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SnakeMain extends JFrame {
	private static final long serialVersionUID = -2823443898141165094L;
	JPanel p1 = new JPanel();
	JLabel[][] l = new JLabel[10][10];
	Timer t1;
	private int x = 3;
	private int y = 2;
	private int deltaX;
	private int deltaY;

	public SnakeMain() {
		add(p1);
		p1.setLayout(new GridLayout(10, 10));
		p1.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		for (int i = 0; i < l.length; i++) {
			for (int j = 0; j < l[i].length; j++) {
				l[i][j] = new JLabel();
				p1.add(l[i][j]);

			}
			addKeyListener(new KeyListener() {

				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_LEFT) {
						deltaX = -1;
						deltaY = 0;
					} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
						deltaX = 1;
						deltaY = 0;
					} else if (e.getKeyCode() == KeyEvent.VK_UP) {
						deltaX = 0;
						deltaY = -1;
					} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
						deltaX = 0;
						deltaY = 1;
					}

				}
			});

		}

		t1 = new Timer(500, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (x >= l.length - 1 || x < 1 || y >= l.length - 1 || y < 1) {
					JOptionPane.showMessageDialog(null, "Game Over");
					System.exit(0);
				}
				l[y][x].setText("");
				x += deltaX;
				y += deltaY;
				l[y][x].setText("O");

			}
		});

		t1.start();

		setVisible(true);
		setSize(550, 280);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new SnakeMain();

	}
	
	public class Snake {
		JLabel[][] l2 = new JLabel[10][10];
		int x;
		int y;
		
	}

}
