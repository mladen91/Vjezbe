package ba.bitcamp.vjezbe;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Task6 extends JFrame {

	private static final long serialVersionUID = -8026123167804945558L;

	private JLabel l = new JLabel("Text");
	private JTextField text = new JTextField();
	private JButton b = new JButton("Start");
	private Timer t;
	private int num = 0;

	public Task6() {

		t = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
		
					if(num>=0){
					l.setText(""+num--);
					}else{
						t.stop();
						text.setText("");
					}
			}
		});
		setLayout(new GridLayout(3, 1));
		add(l);
		add(text);
		add(b);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				

				if (e.getSource()==b) {
					t.start();	 
					num=Integer.parseInt(text.getText());
				}
				
			}
		});
		
		setSize(300, 100);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new Task6();

	
	}
}
