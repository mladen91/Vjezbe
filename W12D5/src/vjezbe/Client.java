package vjezbe;

import java.net.Socket;

public class Client {

	private Socket socket;
	private Snake snake;
	
	public Client(Socket socket, Snake snake) {
		super();
		this.socket = socket;
		this.snake = snake;
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public Snake getSnake() {
		return snake;
	}

	public void setSnake(Snake snake) {
		this.snake = snake;
	}
	
	
	
	
}
