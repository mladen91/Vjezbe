package ba.bitcamp.vjezbe;

public class Main {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(5, 10);
		Line l1 = new Line(5);
		l1.drawOnConsole();
		r1.drawOnConsole();
		System.out.println(r1.toString());

	}

}
