package ba.bitcamp.predavanja;

import java.awt.Color;

public class Point {

	private int x;
	private int y;
	private int circleSize;

	private Color color;

	public Point(int x, int y, Color color, int circleSize) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.circleSize = circleSize;
	}

	public int getX() {
		return x;
	}

	public int getCircleSize() {
		return circleSize;
	}

	public void setCircleSize(int circleSize) {
		this.circleSize = circleSize;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
