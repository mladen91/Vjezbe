package preadavanja;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import preadavanja.Client.ButtonHandler;

public class Server extends JFrame {

	private JButton save = new JButton("Save");
	private JTextField field = new JTextField();
	private JTextArea area = new JTextArea();

	private ServerSocket server = null;
	private Socket client = null;

	//private BufferedWriter writer = null;
	//private BufferedReader reader = null;
	private String s = "";

	public Server() throws IOException {
		save.addActionListener(new ButtonHandler());
		field.addActionListener(new ButtonHandler());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setTitle("Server");

		setLayout(new BorderLayout());
		add(save, BorderLayout.SOUTH);
		add(field, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);

		setVisible(true);
		System.out.println("Server started");
		server = new ServerSocket(8888);
		client = server.accept();
		System.out.println("Client connected");

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				client.getInputStream()));

		while ((s = reader.readLine()) != null) {
			area.append("Client: " + s + "\n");
		}


	}

	public class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
						client.getOutputStream()));
			//	s = reader.readLine();
				writer.write(field.getText());
				writer.newLine();
				writer.flush();
				//area.append("Client: " + s + "\n");
				area.append("Server: " + field.getText() + "\n");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
		try {
			new Server();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
