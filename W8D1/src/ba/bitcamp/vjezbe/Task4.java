package ba.bitcamp.vjezbe;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Task4 extends JFrame {

	private static final long serialVersionUID = -1611277276378344329L;

	private JLabel emailLabel = new JLabel("Email: ");
	private JLabel nameLabel = new JLabel("Name: ");
	private JLabel commentLabel = new JLabel("Comment: ");
	private JTextField email = new JTextField(10);
	private JTextField name = new JTextField(10);
	private JTextArea comment = new JTextArea();
	private JButton submit = new JButton("Submit !");

	public Task4() {

		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (email.getText().contains("@")
						&& email.getText().contains(".com")) {

					JOptionPane.showMessageDialog(null, "Saved !");

				} else

					JOptionPane.showMessageDialog(null, "Error !");

			}

		});

		add(emailLabel);
		add(email);
		add(nameLabel);
		add(name);

		add(commentLabel);

		add(comment);

		add(submit);

		setLayout(new GridLayout(4, 2));

		setLocationRelativeTo(null);

		setSize(800, 600);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Task4();

	}

}
