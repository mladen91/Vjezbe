package preadavanja;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client extends JFrame {

	private JButton save = new JButton("Save");
	private JTextField field = new JTextField();
	private JTextArea area = new JTextArea();

	private Socket client = null;
//	private BufferedWriter writer = null;
//	private BufferedReader reader = null;
	private String s = "";

	public Client() throws UnknownHostException, IOException {
		save.addActionListener(new ButtonHandler());
		field.addActionListener(new ButtonHandler());
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setTitle("Client");
		add(save, BorderLayout.SOUTH);
		add(field, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);

		setVisible(true);

		System.out.println("Client started");
		client = new Socket("10.0.82.18", 8888);

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				client.getInputStream()));
		
		
		while ((s = reader.readLine()) != null) {
			area.append("Server: " + s + "\n");
		}


	}

	public class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			try {
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
						client.getOutputStream()));
				//s = reader.readLine();
				writer.write(field.getText());
				writer.newLine();
				writer.flush();
				//area.append("Client: " + s + "\n");
				area.append("Client: " + field.getText() + "\n");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {

		try {
			new Client();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
