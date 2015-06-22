package ba.bitcamp.vjezbe.task2;

import ba.bitcamp.vjezbe.Drawable;
import ba.bitcamp.vjezbe.Line;
import ba.bitcamp.vjezbe.Rectangle;

public class MainBa {

	public static void main(String[] args) {

		Drawable[] d = new Drawable[50];

		for (int i = 0; i < d.length; i++) {
			if (i % 2 == 0) {
				d[i] = new Rectangle((int) (Math.random() * 4 + 1),
						(int) (Math.random() * 4 + 1));
			} else
				d[i] = new Line((int) (Math.random() * 4 + 1));

		}
		for (int i = 0; i < d.length; i++) {
			d[i].drawOnConsole();
			System.out.println("\n");
		}

	}
}
