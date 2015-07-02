package ba.bitcamp.vjezbe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Lay1 extends JFrame{

	
	private static final long serialVersionUID = -6885810081753196169L;
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JLabel l1 = new JLabel("Label 1");
	JLabel l2 = new JLabel("Label 2");
	JButton[] b1 = new JButton[9];
	JTextArea textField = new JTextArea("Text Area");
	
	public Lay1(){
		setLayout(new GridLayout(1,0));
		add(p1);
		add(p2);
		p1.setLayout(new BorderLayout());
		
		p1.add(textField, BorderLayout.CENTER);
		textField.setLayout(new GridLayout(1,1));
		p1.add(l1, BorderLayout.SOUTH);
		p1.add(l2, BorderLayout.NORTH);
		p1.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		
		p2.setLayout(new GridLayout(3,3));
		
		for (int i = 0; i < b1.length; i++) {
			b1[i]=new JButton("Button"+i);
			p2.add(b1[i]);
			b1[i].setPreferredSize(new Dimension(100, 100));
		}
		
		p2.setBorder(BorderFactory.createTitledBorder("Panel 2"));
		
		
		
		
		
		
		
		
		setVisible(true);
		setSize(550,280);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Lay1();

	}

}
