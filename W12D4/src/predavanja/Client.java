package predavanja;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client extends JFrame {

	private static final long serialVersionUID = 1298383866907516111L;
	// GUI components
	private JButton send = new JButton("Send");
	private JTextArea area = new JTextArea();
	private JTextField field = new JTextField();
	private JPanel panel = new JPanel();
	private JPanel panel2 = new JPanel();
	// Client components
	Socket client = null;
	BufferedWriter writer = null;
	BufferedReader reader = null;
	ExecutorService pool = Executors.newSingleThreadExecutor();
	String line = "";

	/**
	 * Constructor that creates client and gui application with components on
	 * frame
	 * 
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public Client() throws UnknownHostException, IOException {

		field.addActionListener(new ButtonHandler());
		send.addActionListener(new ButtonHandler());

		setTitle("Client");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Creating client
		client = new Socket("10.0.82.27", 6815);
		// Adding gui components to frame
		setLayout(new BorderLayout());
		add(panel, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		add(field, BorderLayout.NORTH);
		// adding text area to panel
		panel.setLayout(new GridLayout(1, 1));
		panel.add(area);
		// setting text area look
		area.setEnabled(false);
		area.setBackground(Color.GRAY);
		area.setOpaque(true);
		area.setFont(new Font("Monospaced", Font.BOLD, 15));
		// adding components to second panel
		panel2.setLayout(new GridLayout(1, 1));
		panel2.add(send);

		setVisible(true);
		// Creating buffered writer and reader.
		reader = new BufferedReader(new InputStreamReader(
				client.getInputStream()));
		writer = new BufferedWriter(new OutputStreamWriter(
				client.getOutputStream()));
		// Reading lines from client and appending them to text area

		new Thread(new Runnable() {

			@Override
			public void run() {
				for (;;) {
					String l;
					try {
						l = reader.readLine();
						area.append(l + "\n");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}
		}).start();

		// while ((line = reader.readLine()) != null) {
		// if (line.length() > 0) {
		//
		// Handler h = new Handler(line, area);
		// h.checkLine();
		//
		// }
		// }
	}

	/**
	 * This class is used for making actions that will help client and server to
	 * communicate when clicking on button
	 * 
	 * @author Mladen13
	 *
	 */

	public class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			pool.submit(new Runnable() {

				@Override
				public void run() {
					try {

						writer.write(field.getText());
						writer.newLine();
						writer.flush();
						if (field.getText().length() > 0) {
							area.append("Client: " + field.getText() + "\n");

							field.setText("");
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			});
		}
	}

	public static void main(String[] args) {

		try {

			new Client();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
