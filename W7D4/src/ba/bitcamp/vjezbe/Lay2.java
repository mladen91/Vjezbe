package ba.bitcamp.vjezbe;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lay2 extends JFrame {

	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JButton b1  = new JButton("Button 1");
	JLabel l1 = new JLabel("Label 1");
	JButton[] b = new JButton[4];
	JLabel[] l = new JLabel[4];
	
	public Lay2() {
		
		
		setLayout(new BorderLayout());
		add(p1,BorderLayout.CENTER);
		p1.setBorder(BorderFactory.createTitledBorder("Center panel"));
		p1.setLayout(new GridLayout(4, 2));
		
		for (int i = 0; i < l.length; i++) {
			l[i]=new JLabel("Label "+i);
			b[i]=new JButton("Button "+i);
			p1.add(l[i]);
			p1.add(b[i]);
		}
		
		
		
		
		
		
		add(p2,BorderLayout.SOUTH);
		p2.setBorder(BorderFactory.createTitledBorder("South panel"));
		p2.add(l1);
		p2.add(b1);
		
		
		setVisible(true);
		setSize(550, 280);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Lay2();

	}

}
