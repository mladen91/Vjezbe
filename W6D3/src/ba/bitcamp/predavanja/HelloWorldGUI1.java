package ba.bitcamp.predavanja;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HelloWorldGUI1 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Hello World");
		JOptionPane.showInputDialog("Insert something!");
		JOptionPane.showConfirmDialog(null, "Ludilo", "Sta ima", 2, 3);

		
		JFrame window = new JFrame("titl");
		JPanel panel = new JPanel();
		JButton jButton = new JButton("fa");

	}

}
