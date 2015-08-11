package vjezbe;

public class Snake {
	private int[] snakeX= new int[1000];
	private int[] snakeY= new int[1000];
	private int snakeXstart;
	private int snakeYstart;
	
	
	
	
	public Snake(int snakeXstart, int snakeYstart){
		
		this.snakeX[0]=snakeXstart;
		this.snakeY[0]=snakeYstart;
	}

	public int getSnakeXstart() {
		return snakeXstart;
	}

	public int getSnakeYstart() {
		return snakeYstart;
	}


	public int[] getSnakeX() {
		return snakeX;
	}

	public int[] getSnakeY() {
		return snakeY;
	}


	

	
	
}
