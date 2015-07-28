package vjezbe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Client extends JFrame {

	JTextArea jta = new JTextArea();
	JButton send = new JButton("Send message");
	Socket socket = null;

	BufferedWriter writer = null;

	public Client() {

		setLayout(new BorderLayout());
		add(jta, BorderLayout.CENTER);
		add(send, BorderLayout.SOUTH);
		send.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					socket = new Socket("10.0.82.98", 7777);
					writer = new BufferedWriter(new OutputStreamWriter(socket
							.getOutputStream()));

					writer.write(jta.getText());
					writer.newLine();
					writer.flush();

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}

	public static void main(String[] args) {

		new Client();

		

	}
}
