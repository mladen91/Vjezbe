package ba.bitcamp.predavanja;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Vehicle {

	private static final int STEP = 5;
	public int x;
	public int y;
	public Color color;
	
	public Vehicle(int x, int y, Color color){
		this.x=x;
		this.y=y;
		this.color=color;
	}
	public void draw(Graphics g){
		
		g.setColor(Color.BLUE);
		g.drawRect(x, y, 40, 60);
	}
	public void moveLeft() {
		x -= STEP;
		
	}
	
	public void moveRight() {
		x += STEP;		
	}
	
	
}
