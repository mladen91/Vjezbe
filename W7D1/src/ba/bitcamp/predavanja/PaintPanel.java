package ba.bitcamp.predavanja;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {

	private PointArray points;
	private Color activeColor;
	private int circleSize=5;

	private static Color[] supportedColor = new Color[] { Color.RED,
			Color.BLUE, Color.GREEN, Color.ORANGE};
	
	private static JButton[] shrinkButton = new JButton[] {new JButton(), new JButton(), new JButton()};

	public PaintPanel(int height, int width) {
		super();

		points = new PointArray();
		setSize(width, height);
		setBackground(Color.WHITE);
		MouseHandler mh = new MouseHandler();
		addMouseMotionListener(mh);

		for (int i = 0; i < supportedColor.length; i++) {
			JButton color = new JButton("Pick");
			color.setName(Integer.toString(i));
			color.setForeground(supportedColor[i]);

			color.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton clicked = (JButton) e.getSource();
					String name = clicked.getName();
					int index = Integer.parseInt(name);
					activeColor = supportedColor[index];

				}
			});

			add(color);
		}
		int j = 5;
		for (int i = 0; i < shrinkButton.length; i++) {
			JButton resize = new JButton("Resize: "+j);
			resize.setName(Integer.toString(i));
			final int k = i;
			resize.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton clicked = (JButton) e.getSource();
					String name = clicked.getName();
					int index = Integer.parseInt(name);
					circleSize = (k+1) * 5;
				}
			});
            j+=5;
			add(resize);
		}
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int i = 0; i < points.getLength(); i++) {
			Point p = points.elementAt(i);
			g.setColor(p.getColor());
			g.fillOval(p.getX(), p.getY(), p.getCircleSize(), p.getCircleSize());

		}
	}

	public class MouseHandler implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {

			Point newPoint = new Point(e.getX(), e.getY(), activeColor,circleSize);

			if (e.isShiftDown() == true) {
				newPoint.setColor(Color.WHITE);
			}

			points.addPoint(newPoint);
			repaint();

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}
}
