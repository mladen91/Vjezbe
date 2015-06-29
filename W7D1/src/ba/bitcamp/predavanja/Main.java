package ba.bitcamp.predavanja;

import java.awt.Color;

import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		
     JFrame window = new JFrame("Out little program");
     PaintPanel dp = new PaintPanel(500,500);
     
     
     window.add(dp);
     
     
     window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //Obavijest da se nacrta je setVisible, add treba prije biti
     window.setVisible(true);
     window.setSize(500, 500);

     
     
     

     
	}
	
	

}
