package vjezbe;

import java.awt.BorderLayout;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Main extends JFrame {

	private static final long serialVersionUID = 5404827922497573885L;

	private JPanel p = new JPanel();

	private static JLabel l2 = new JLabel("Eat as many as you can!");
	
	public Main(){
		GamePanel panel = new GamePanel();
	
		
	
		
		panel.addSnake(new Snake(100,150));
		panel.addSnake(new Snake(100,100));
		
		setLayout(new BorderLayout());
		add(p, BorderLayout.NORTH);
		p.add(l2);
		add(panel);
		
		
		setResizable(false);
		pack();
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		JFrame ex = new Main();
		ex.setVisible(true);
	}
}
