package ba.bitcamp.vjezbe;

public class Task6 {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		Date d2 = new Date();
		Date d3 = new Date(2, 3, 2001);
		Date[] dates = new Date[3];
		dates[0]=d1;
		dates[1]=d2;
		dates[2]=d3;
		
		for (Date date:dates){
			System.out.println(date);
		}

		

	}

}
