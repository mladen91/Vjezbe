import java.awt.Graphics;


public class Drawing {

	public static void main(String[] args, Object g) {
		
		int i;
		int y;
		Graphics g1 = null;
		
		y=50;
		for (i=1;i<=10;i++) {
			
			g1.drawLine(100,y,30,y);
		
			y=y+10;
			System.out.println(g1);
		}

	}

}
