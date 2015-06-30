package ba.bitcamp.predavanja;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RacingGame extends JPanel {

	int width;
	int height;
	private Vehicle myVehicle;

	public RacingGame(int width, int height) {
		this.width = width;
		this.height = height;

		this.myVehicle = new Vehicle(width / 2, height - 90, Color.BLUE);
		addKeyListener(new MyVehicleControl());
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((Component)e.getSource()).requestFocus();
			}
		});

	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		myVehicle.draw(g);

	}

	private class MyVehicleControl extends KeyAdapter {

		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				myVehicle.moveLeft();
			} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				myVehicle.moveRight();
			}
			repaint();
		}
	}

}
