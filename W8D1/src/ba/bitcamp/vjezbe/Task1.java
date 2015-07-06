package ba.bitcamp.vjezbe;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Task1 extends JFrame {
	private static final long serialVersionUID = 4845533619775211274L;

	private JButton button = new JButton("Click for modeless");
	private JButton button2 = new JButton("Click for modal");

	public Task1() {
		setLayout(new GridLayout(1, 2));
		add(button);
		add(button2);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new MyDialog();
			}
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new MyDialog2();

			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 100);
		setLocationRelativeTo(null);
		setTitle("Example JFrame");
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task1();

	}

	private class MyDialog extends JDialog {
		private static final long serialVersionUID = -4070623060379881616L;

		public MyDialog() {
			setLayout(new BorderLayout());

			setModalityType(ModalityType.MODELESS);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(200, 100);
			setLocationRelativeTo(null);
			setTitle("Example JDialog");
			setVisible(true);
		}
	}

	private class MyDialog2 extends JDialog {
		private static final long serialVersionUID = -4070623060379881616L;

		public MyDialog2() {
			setLayout(new BorderLayout());

			setModalityType(ModalityType.APPLICATION_MODAL);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(200, 100);
			setLocationRelativeTo(null);
			setTitle("Example JDialog 2");
			setVisible(true);
		}
	}

}
