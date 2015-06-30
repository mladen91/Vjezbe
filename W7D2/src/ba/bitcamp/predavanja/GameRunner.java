package ba.bitcamp.predavanja;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameRunner extends JPanel {

	public static void main(String[] args){
		RacingGame racingGame = new RacingGame(600,400);
		JFrame window = new JFrame("Racing game");

		window.setSize(800,600);
		window.setLocation(50,50);
		window.setResizable(false);
		window.setContentPane(racingGame);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
