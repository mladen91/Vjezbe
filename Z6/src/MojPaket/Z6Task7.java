package MojPaket;

public class Z6Task7 {

	public static void main(String[] args) {
	
	int n=151;
	int pomocni=0;
	int novi =0;
	
	
	while (n>0) {
	pomocni=n%10;
	n/=10;
	novi+=pomocni;
	novi*=10;
	}
	novi/=10;
	if (pomocni==novi) {
	
			System.out.println(" Dati broj je palindrom");
		
	}
		
	}
}
