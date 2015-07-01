package ba.bitcamp.vjezbe;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Task3 extends JFrame {
	private JTextField text = new JTextField();
	private JPasswordField pass = new JPasswordField();
	JLabel l1 = new JLabel("Username:");
	JLabel l2 = new JLabel("Password:");
	Font f1;

	public Task3() {
		setLayout(new GridLayout(2, 2));
		add(l1);
		add(text);
		add(l2);
		add(pass);
		text.addActionListener(new AL());
		pass.addActionListener(new AL());
		setSize(300, 100);

		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Task3();

	}

	public class AL implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String correctUsername = "Mujo";
			String givenUsername = text.getText();
			String correctPassword = "1234";
			String givenPassword = String.valueOf(pass.getPassword());

			if (e.getSource() == pass || e.getSource() == text) {
				if (correctPassword.equals(givenPassword)
						&& correctUsername.equals(givenUsername)) {
					System.exit(0);
				} else {
					JOptionPane.showMessageDialog(null,
							"Incorrect username or password!");
				}
			}

		}

	}

}
