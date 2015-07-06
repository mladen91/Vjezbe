package ba.bitcamp.vjezbe;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Task2 extends JFrame {
	
	private String[] mails = new String[]{"mail","mail2","mail3"}; 
	private JTextField text = new JTextField();
	private JButton b = new JButton("Check email");
	 private JLabel l = new JLabel();
	
	public Task2(){
		setLayout(new GridLayout(2, 1));
		add(text);
		add(b);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < mails.length; i++) {
					if(text.getText().equals(mails[i])){
						new MyDialog();
						l.setText("Email is already used.");	
						break;
					}else {
						new MyDialog();
						l.setText("Email is free.");
						break;
					}
				}
				
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 100);
		setLocationRelativeTo(null);
		setTitle("Task 2");
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task2();

	}
	
	private class MyDialog extends JDialog {
		private static final long serialVersionUID = -4070623060379881616L;
       
		
		
		public MyDialog() {
			setLayout(new BorderLayout());
            add(l,BorderLayout.CENTER);
            l.getText();
			setModalityType(ModalityType.MODELESS);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(200, 100);
			setLocationRelativeTo(null);
			setTitle("Example JDialog");
			setVisible(true);
		}
	}

}
