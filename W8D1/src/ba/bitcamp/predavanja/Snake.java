package ba.bitcamp.predavanja;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Snake extends JPanel {

	private static final long serialVersionUID = -9199685722803729431L;
	private static final int HEIGHT = 600;
	private static final int WIDTH = 800;
	private static final int MAXDOTS = 1000;
	private static final int MAXFOODFIELD = 59;
	private static final int TILESIZE = 10;
	// Snake arrays for X and Y coordinates
	private int[] snakeX = new int[MAXDOTS];
	private int[] snakeY = new int[MAXDOTS];

	// Snake size
	private int size;
	// Food x and y coordinates
	private int foodX;
	private int foodY;
	// This variables will be used for changing directions
	private boolean left = false;
	private boolean right = true;
	private boolean up = false;
	private boolean down = false;
	private int score = 0;
	// Creating timer
	private Timer t;
	private int gameSpeed = 1;
	private int delay = 50;

	public Snake() {
		// Adding key listener that will move snake
		addKeyListener(new KeyHandler());
		setFocusable(true);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		// Setting snake size to 3
		size = 3;
		// This will make snake on the beginning of the game
		for (int i = 0; i < size; i++) {
			snakeX[i] = 50 - i * TILESIZE;
			snakeY[i] = 50;
		}
		// Calling method that will set food on random panel position
		generateFood();
		// Initializing timer with action listener
		t = new Timer(delay, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Calling method where snake eats food, and extends itself by
				// one
				eatedFood();
				// Method for moving trough panel
				move();
				// Calling method that will check if snake hits where it
				// shouldn't.
				checkCollision();

				repaint();

			}
		});
		// Starting timer
		t.start();

	}

	/**
	 * This method will call paintComponent from super class, and draw objects
	 * from Draw method
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Draw(g);
	}

	/**
	 * This method will be used for drawing snake, food, and game panel
	 * 
	 * @param g
	 */
	private void Draw(Graphics g) {

		// Setting background color
		g.setColor(new Color(230, 230, 230));
		g.fillRect(0, 0, WIDTH, HEIGHT);
		// Setting color for lines that are drawn every 10 spots
		g.setColor(Color.BLACK);
		// Drawing lines for field
		for (int i = 0; i < WIDTH / TILESIZE; i++) {

			g.drawLine(i * TILESIZE, 0, i * TILESIZE, HEIGHT);

		}
		for (int i = 0; i < HEIGHT / TILESIZE; i++) {

			g.drawLine(0, i * TILESIZE, WIDTH, i * TILESIZE);
		}
		// Drawing food on panel and setting color to red
		g.setColor(Color.RED);
		g.fillRect(foodX, foodY, TILESIZE, TILESIZE);
		// Drawing snake
		for (int i = 0; i < size; i++) {
			// Representing snake head
			if (i == 0) {
				g.setColor(Color.BLACK);
				g.fillRect(snakeX[i], snakeY[i], TILESIZE, TILESIZE);
				g.setColor(Color.RED);
				g.fillRect(snakeX[i], snakeY[i], TILESIZE - 2, TILESIZE - 2);
				// Snake body
			} else {

				g.setColor(Color.BLACK);
				g.fillRect(snakeX[i], snakeY[i], TILESIZE, TILESIZE);
				g.setColor(Color.GREEN);
				g.fillRect(snakeX[i], snakeY[i], TILESIZE - 2, TILESIZE - 2);

				g.setColor(Color.RED);
				g.setFont(new Font("Serif", Font.BOLD, 15));
				g.drawString("Score: " + score, 10, 15);

			}
		}
		// Synchronizes graphics state. It ensures that the display is
		// up-to-date
		Toolkit.getDefaultToolkit().sync();

	}

	/**
	 * Method that generates food on random place in the gaming board
	 */
	private void generateFood() {
		int r = (int) (Math.random() * MAXFOODFIELD);
		foodX = ((r * TILESIZE));

		r = (int) (Math.random() * MAXFOODFIELD);
		foodY = ((r * TILESIZE));

	}

	/**
	 * This method is called when snake eats food. It is used to extend snake
	 * and generate new food on field
	 */
	private void eatedFood() {

		if ((snakeX[0] == foodX) && (snakeY[0] == foodY)) {
			gameSpeed++;
			size++;
			score += 10;
			generateFood();
			if (gameSpeed == 10) {
				t.setDelay(delay -= 1);
				gameSpeed = 0;
			}
		}
	}

	/**
	 * This method simulates snake moving, and gives directions when clicking
	 * direction buttons.
	 */
	private void move() {

		for (int i = size; i > 0; i--) {
			snakeX[i] = snakeX[(i - 1)];
			snakeY[i] = snakeY[(i - 1)];
		}

		if (left) {
			snakeX[0] -= TILESIZE;
		}

		if (right) {
			snakeX[0] += TILESIZE;
		}

		if (up) {
			snakeY[0] -= TILESIZE;
		}

		if (down) {
			snakeY[0] += TILESIZE;
		}
	}

	/**
	 * This method checks if our snake hits into wall, or it hits her tail.
	 */
	private void checkCollision() {

		for (int i = size; i > 0; i--) {

			if ((i > 4) && (snakeX[0] == snakeX[i]) && (snakeY[0] == snakeY[i])
					|| snakeY[0] >= HEIGHT || snakeY[0] < 0
					|| snakeX[0] >= WIDTH || snakeX[0] < 0) {
				JOptionPane.showMessageDialog(null,
						"Game Over! Your final score is: " + score);
				System.exit(0);
			}
		}
	}

	/**
	 * This class is used as Key Listener, where we order snake where to go.
	 * 
	 * @author Mladen13
	 *
	 */
	private class KeyHandler extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {

			if ((e.getKeyCode() == KeyEvent.VK_LEFT) && (!right)) {
				left = true;
				up = false;
				down = false;
			}

			if ((e.getKeyCode() == KeyEvent.VK_RIGHT) && (!left)) {
				right = true;
				up = false;
				down = false;
			}

			if ((e.getKeyCode() == KeyEvent.VK_UP) && (!down)) {
				up = true;
				right = false;
				left = false;
			}

			if ((e.getKeyCode() == KeyEvent.VK_DOWN) && (!up)) {
				down = true;
				right = false;
				left = false;
			}
		}
	}

}
