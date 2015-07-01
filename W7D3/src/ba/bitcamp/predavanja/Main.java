package ba.bitcamp.predavanja;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends JPanel {

	JLabel l1 = new JLabel("Name");
	JLabel l2 = new JLabel("Email");
	JTextField f1 = new JTextField(30);
	JTextField f2 = new JTextField(30);

	JTextArea terms = new JTextArea(10, 30);

	public Main() {

		JFrame window = new JFrame();
		JPanel container = new JPanel();
		JCheckBox cb = new JCheckBox("I accept the terms and conditions.");
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(cb.isSelected()){
					
					System.out.println("Name: " + f1.getText() + "\nEmail: "
						+ f2.getText());
					
				}else{
				
				
				f1.setText("");
				f2.setText("");
				JOptionPane.showMessageDialog(null,
						"You didn't accept terms and conditions.");
				}
				
			}
		});

		cb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				JCheckBox cb = (JCheckBox) e.getSource();
//
//				 submit.setEnabled(cb.isSelected());

			}
		});

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Adding label NAME
		container.add(l1);
		l1.setForeground(Color.BLUE);
		l1.setFont(new Font("Serif", Font.ITALIC, 24));
		// Adding text field
		container.add(f1);
		// Adding label EMAIL
		container.add(l2);
		l2.setForeground(Color.BLUE);
		l2.setFont(new Font("Serif", Font.ITALIC, 24));
		// Adding text field
		container.add(f2);
		// Adding panel to window
		window.add(container);

		container.add(terms);
		terms.setText("afafafafas");
		terms.setLineWrap(true);
		container.add(cb);
		container.add(submit);
		submit.setEnabled(true);

		window.setVisible(true);
		window.setSize(400, 600);
	}

	public static void main(String[] args) {

		new Main();
	}

}
