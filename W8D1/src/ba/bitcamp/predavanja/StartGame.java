package ba.bitcamp.predavanja;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class StartGame extends JFrame {

	private static final long serialVersionUID = -4771609170448976958L;

	private JPanel p = new JPanel();
	private static JLabel l = new JLabel();
	private static JLabel l2 = new JLabel("Eat as many as you can!");
	private boolean isSinglePlayer = true;
	private boolean isMultiPlayer = true;

	public StartGame() {

		int choice = JOptionPane.showConfirmDialog(null,
				"Do you want to play Multiplayer mode?");
		// Choosing between single and multiplayer modes.
		if (choice == JOptionPane.YES_OPTION) {
			isSinglePlayer = false;
		} else if (choice == JOptionPane.NO_OPTION) {
			isMultiPlayer = false;
		} else if (choice == JOptionPane.CANCEL_OPTION) {
			System.exit(0);
		}
		// Creating multiplayer mode
		if (isMultiPlayer) {
			SnakeMultiplayer s1 = new SnakeMultiplayer();
			setLayout(new BorderLayout());
			add(p, BorderLayout.NORTH);
			p.add(l);
			l.setFont(new Font("Sans Serif", Font.BOLD, 12));
			l.setForeground(Color.RED);
			p.add(l2);
			add(s1);
			setResizable(false);
			pack();
			setTitle("Snake - Single Player Mode");
			// Creating single player mode
		} else if (isSinglePlayer) {
			Snake s = new Snake();
			setLayout(new BorderLayout());
			add(p, BorderLayout.NORTH);
			p.add(l2);
			add(s);
			setResizable(false);
			pack();
			setTitle("Snake - Multiplayer Mode");

		}
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void updateScore() {
		l.setText("Double score time! Double score time! Double score time!");
		l2.setText("");
	}

	public static void updateLabel() {
		l.setText("");
		l2.setText("Normal eat time!");
	}

	public static void main(String[] args) {

		JFrame ex = new StartGame();
		ex.setVisible(true);

	}

}
