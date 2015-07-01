package ba.bitcamp.predavanja;

import javax.swing.JFrame;

public class MainSlider {

	public static void main(String[] args) {
		JFrame window = new JFrame("Picker");
		
		ColorPicker cp = new ColorPicker(500, 500);
		window.add(cp);
		
		window.setSize(500, 500);
		window.setVisible(true);
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);

	}

}
