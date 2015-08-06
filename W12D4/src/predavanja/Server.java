package predavanja;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Server {

	private static LinkedBlockingQueue<ChatClient> clients;
	private static LinkedBlockingQueue<Message> messages;
	private static ExecutorService pool = Executors.newFixedThreadPool(8);

	public static void main(String[] args) {
		clients = new LinkedBlockingQueue<ChatClient>();
		messages = new LinkedBlockingQueue<Message>();
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Sender());
		pool.submit(new Sender());
		pool.submit(new Sender());

		try {
			ServerSocket server = new ServerSocket(6815);
			Socket client;

			client = server.accept();
			clients.add(new ChatClient(client));
			new Thread(new Listener()).start();
			new Thread(new Sender()).start();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static class Listener implements Runnable {

		@Override
		public void run() {
			ChatClient c = null;
			try {
				c = clients.take();

				BufferedReader reader = c.getReader();
				StringBuilder st = new StringBuilder();

				while (reader.ready()) {
					st.append(reader.readLine());
					Message message = new Message(c.getId(), st.toString());
					messages.add(message);
				}

				clients.add(c);
			} catch (InterruptedException e) {
				clients.remove(c);
				e.printStackTrace();
			} catch (IOException e) {
				clients.remove(c);
				e.printStackTrace();
			}
			pool.execute(this);
		}

	}

	private static class Sender implements Runnable {

		@Override
		public void run() {
			try {
				Message m = messages.take();
				ChatClient[] clientArr = null;
				synchronized (clients) {
					clientArr = new ChatClient[clients.size()];
					for (int i = 0; i < clientArr.length; i++) {
						clientArr[i] = clients.take();
						clients.add(clientArr[i]);
					}
				}

				for (int i = 0; i < clientArr.length; i++) {
					BufferedWriter writer = clientArr[i].getWriter();
					writer.write(m.getMessage());
					writer.flush();
				}
				pool.submit(this);
			} catch (InterruptedException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
