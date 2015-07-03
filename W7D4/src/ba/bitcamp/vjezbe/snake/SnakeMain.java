package ba.bitcamp.vjezbe.snake;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SnakeMain extends JFrame {
	private static final long serialVersionUID = -2823443898141165094L;
	JPanel p1 = new JPanel();
	JLabel[][] l = new JLabel[15][15];
	Timer t1;
	private int x = 3;
	private int y = 2;
	private int deltaX;
	private int deltaY;

	int foodX = (int) (Math.random() * 10);
	int foodY = (int) (Math.random() * 10);

	int foodCoordinateX;
	int foodCoordinateY;

	int fieldCoordinateX;
	int fieldCoordinateY;

	Point[] snake = new Point[1];

	public SnakeMain() {
		add(p1);
		p1.setLayout(new GridLayout(15, 15));
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

		l[foodY][foodX].setText("O");

		snake[0] = new Point(y, x);
		l[snake[0].y][snake[0].x].setText("");

		t1 = new Timer(500, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					fieldCoordinateX = l[y][x].getX();
					fieldCoordinateY = l[y][x].getY();

					foodCoordinateX = l[foodY][foodX].getX();
					foodCoordinateY = l[foodY][foodX].getY();

					if (fieldCoordinateX == foodCoordinateX
							&& fieldCoordinateY == foodCoordinateY) {

						food();

						snake = extendArray(snake);

						for (int i = 0; i < snake.length; i++) {

							snake[i] = new Point(y, x);
							l[snake[i].y][snake[i].x].setText("O");

						}

					}

					for (int i = 0; i < snake.length; i++) {

						l[snake[i].x][snake[i].y].setText("");
						snake[i] = new Point(y += deltaY, x += deltaX);
						if (i == snake.length - 1) {
							l[snake[i].y][snake[i].x].setForeground(Color.RED);
						}
						l[snake[i].x][snake[i].y].setText("O");

					}

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Game Over");
					System.exit(0);
				}
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

	public void food() {
		foodX = (int) (Math.random() * 10);
		foodY = (int) (Math.random() * 10);

		foodCoordinateX = l[foodY][foodX].getX();
		foodCoordinateY = l[foodY][foodX].getY();
		l[foodY][foodX].setText("O");

	}

	public Point[] extendArray(Point[] p) {

		Point[] points = new Point[p.length + 1];

		for (int i = 0; i < p.length; i++) {
			points[i] = p[i];
		}
		return points;
	}

	public Point[] replaceElements(Point[] p) {

		Point tmp = p[p.length - 1];
		for (int i = p.length - 1; i > 0; i--) {
			p[i] = p[i - 1];
		}
		p[0] = new Point(tmp.x + deltaX, tmp.y + deltaY);
		return p;
	}

}
