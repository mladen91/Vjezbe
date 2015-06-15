package MojPaket;

public class Z6Task8 {

	public static void main(String[] args) {
		
		int n=13;
		int a=0;
		int counter=0;
		
		while (a<n) {
			a++;
			boolean divisible =n%a==0;
			
			if (divisible == true) {
				counter++;
			}
		}

		if (counter ==2) {
			System.out.println("Broj je prost");
		}
		else  {
			System.out.println("Broj je slozen");
		}
	}

}
