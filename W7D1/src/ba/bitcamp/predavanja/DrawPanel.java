package ba.bitcamp.predavanja;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

public class DrawPanel extends JPanel {

	private static final long serialVersionUID = 2713747228799329292L;

	private Color backgroundColor = Color.RED;

	public DrawPanel(int height, int width) {

		setSize(width, height);
		JButton blue = new JButton("Blue");

		blue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				backgroundColor = Color.BLUE;

			}
		});

		add(blue);
		addMouseListener(new MouseHandler());
		addMouseMotionListener(new MouseHandler());

	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(backgroundColor);

		g.fillOval(190, 150, 100, 100);

	}

	public void drawSquare() {

		Graphics g = super.getGraphics();
		paintComponent(g);
		g.fillRect(50, 50, 100, 100);
	}

	private class MouseHandler implements MouseListener, MouseMotionListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 20, 30);

		}

		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("Mouse Pressed");

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("Mouse Released");

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Graphics g = getGraphics();
			g.setColor(backgroundColor);

		}

		@Override
		public void mouseExited(MouseEvent e) {
			Graphics g = getGraphics();
			g.setColor(Color.BLACK);

		}

		@Override
		public void mouseDragged(MouseEvent e) {
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 20, 30);

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 20, 30);

		}

	}
}
