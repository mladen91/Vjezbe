package ba.bitcamp.vjezbe;

public class Line implements Shape, Drawable {

	private int length;

	public Line(int lenght) {
		this.length = lenght;
	}

	@Override
	public void drawOnConsole() {
		for (int i = 0; i < length; i++) {
			System.out.print("*");
		}

	}

	@Override
	public int getCircumference() {

		return 0;
	}

	@Override
	public int getArea() {

		return 0;
	}

	public String toString() {
		String s = "";
		return s;
	}
}
