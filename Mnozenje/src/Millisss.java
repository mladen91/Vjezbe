
public class Millisss {

	public static void main(String[] args) {
		
		
		long milliseconds =System.currentTimeMillis();
		int seconds = (int) (milliseconds / 1000) % 60 ;
		int minutes = (int) ((milliseconds / (1000*60)) % 60);
		int hours   = (int) ((milliseconds / (1000*60*60)) % 24);
		int hoursBalkan = hours+2;
		
		System.out.printf("%d:%d:%d\n",hoursBalkan,minutes,seconds);
	}

}
