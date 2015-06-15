package MojPaket;

public class Z6Task5 {

	public static void main(String[] args) {
		
		int n=50;
		int a=0;
		
		while (a<n) {
			a++;
			if (a%3==0 && a%5!=0 && a%2==1) {
				System.out.println(a);
			}
		}

	}

}
