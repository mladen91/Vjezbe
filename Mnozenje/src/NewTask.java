import java.util.Scanner;


public class NewTask {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int sum=0;
		TextIO.readFile("src/NoviFajl");
		int highscore=TextIO.getInt();
		TextIO.readStandardInput();
		
		for (int i=0;i<10;i++) {
			
			int a = (int)(Math.random()*9+1);
			int b = (int)(Math.random()*9+1);
			System.out.printf("Insert your result: %d * %d = ",a,b);
			int num = in.nextInt();
			
			if (a*b==num) {
				sum++;
			}
		}
		
		
		
		if (highscore<=sum) {
			long milliseconds =System.currentTimeMillis();
			int seconds = (int) (milliseconds / 1000) % 60 ;
			int minutes = (int) ((milliseconds / (1000*60)) % 60);
			int hours   = (int) ((milliseconds / (1000*60*60)) % 24);
			int hoursBalkan = hours+2;
			
			
			TextIO.writeFile("src/NoviFajl");	
		TextIO.putln("Your score is: "+sum+" Played at:"+hoursBalkan+":"+minutes+":"+seconds);
		System.out.println("Last highscore was: "+highscore);
		TextIO.writeStandardOutput();
		}
		
		/*if (sum>8) {
			sum=0;
			for (int i=0;i<10;i++) {
				
				int a = (int)(Math.random()*20+1);
				int b = (int)(Math.random()*20+1);
				System.out.printf("Insert your result: %d * %d = ",a,b);
				int num = in.nextInt();
				
				if (a*b==num) {
					sum++;
				}
			
			
			}
			System.out.println("Your level 2 score is: "+sum);
			
			
		}*/
		

	}

}
