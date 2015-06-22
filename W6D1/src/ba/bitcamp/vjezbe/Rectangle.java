package ba.bitcamp.vjezbe;

public class Rectangle implements Shape, Drawable {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public void drawOnConsole() {
     for (int i = 0; i < length; i++) {
		for (int j = 0; j < width; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}

	@Override
	public int getCircumference() {

		return 2 * (length + width);
	}

	@Override
	public int getArea() {

		return length * width;
	}
	
	public String toString(){
		String s = "";
		s= "Area of Rectangle: "+getArea();
		s=s+ "\nCircumference of Rectangle: "+getCircumference();
		return s;
	}

}
