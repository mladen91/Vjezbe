package ba.bitcamp.predavanja;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame window = new JFrame("Layouts");
		JPanel container = new JPanel();
		int red ;
		int green ;
		int blue ;
		int red1 ;
		int green1 ;
		int blue1 ;
		Color c1;
		Color c2;
		container.setLayout(new FlowLayout(FlowLayout.LEADING, 0,0));
		//container.setLayout(new BorderLayout());
		//container.setLayout(new GridLayout(2,3));
		JButton[] buttons = new JButton[48];
		for (int i = 0; i < buttons.length; i++) {
			
			 red = (int)(Math.random()*255);
			 green = (int)(Math.random()*255);
		     blue = (int)(Math.random()*255);
		     red1 = (int)(Math.random()*255);
			 green1 = (int)(Math.random()*255);
		     blue1 = (int)(Math.random()*255);
			c1 = new Color(red,green,blue);
			c2 = new Color(red1,green1,blue1);
			buttons[i]=new JButton("Button "+i);
			container.add(buttons[i]);
			buttons[i].setForeground(c1);
			buttons[i].setPreferredSize(new Dimension(100, 50));
			buttons[i].setBackground(c2);
			buttons[i].setOpaque(true);
			//buttons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
			//buttons[i].setBorder(BorderFactory.createMatteBorder(5, 5, 10, 10, Color.BLACK));
			buttons[i].setBorder(BorderFactory.createEtchedBorder());
			buttons[i].setBorder(BorderFactory.createRaisedBevelBorder());
		}
		
//		container.add(buttons[0], BorderLayout.EAST);
//		container.add(buttons[1], BorderLayout.WEST);
//		container.add(buttons[2], BorderLayout.NORTH);
//		container.add(buttons[3], BorderLayout.SOUTH);
		
		window.add(container);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400, 400);
		window.setVisible(true);

	}

}
