package ba.bitcamp.vjezbe;

import java.awt.Button;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task2 extends JFrame {
	private static final long serialVersionUID = -5695010826702907061L;

	JLabel label = new JLabel("Mladen");
	JCheckBox cb1 = new JCheckBox("Bolded");
	JCheckBox cb2 = new JCheckBox("Italic");
	JButton b1 = new JButton("Refresh");
	Font f1;

	public Task2() {

		setLayout(new GridLayout(3, 1));
		add(label);

		add(cb1);
		add(cb2);
		add(b1);
		b1.addActionListener(new AL());
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Task2();

	}

	public class AL implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == b1) {

				if (cb1.isSelected() == true && cb2.isSelected() == true) {
					f1 = new Font("Serif", Font.ITALIC | Font.BOLD, 20);
					label.setFont(f1);
				} else if (cb1.isSelected() == true
						&& cb2.isSelected() == false) {
					f1 = new Font("Serif", Font.BOLD, 20);
					label.setFont(f1);
				} else if (cb2.isSelected() == true
						&& cb1.isSelected() == false) {
					f1 = new Font("Serif", Font.ITALIC, 20);
				}
			} else {
				f1 = new Font("Serif", Font.PLAIN, 20);
				label.setFont(f1);
			}
		}

	}

}
