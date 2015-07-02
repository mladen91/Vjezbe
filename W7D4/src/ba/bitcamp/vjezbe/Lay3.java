package ba.bitcamp.vjezbe;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Lay3 extends JFrame {

	JPanel pC = new JPanel();
	JPanel pE = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	
	JTextArea textArea = new JTextArea();
	
	JLabel[] label = new JLabel[3];
	JButton button1 = new JButton("Button 1");
	JButton button2 = new JButton("Button 2");
	
	
	public Lay3(){
		
		setLayout(new GridLayout(1, 2));
		add(pC);
		pC.setBorder(BorderFactory.createTitledBorder("Center panel"));
		add(pE);
		pE.setBorder(BorderFactory.createTitledBorder("East panel"));
		pE.setLayout(new GridLayout(2, 1));
		
		pE.add(p1);
		p1.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		
		for (int i = 0; i < label.length; i++) {
			label[i]=new JLabel("This seems to be label "+i);
			p1.add(label[i]);
		}
		
		pE.add(p2);
		p2.add(button1);
		p2.add(button2);
		p2.setBorder(BorderFactory.createTitledBorder("Panel 2"));
		
		
		setVisible(true);
		setSize(550, 280);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		
       new Lay3();

	}

}
