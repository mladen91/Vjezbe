package glavni;

public class glavna {

	public static void main(String[] args) {
	
		/*
		int a=4;
		
		if (a>=0) {
			System.out.println("Broj je pozitivan!");
		}
			else if (a<0) {
				System.out.println("Broj je negativan!");
			}  */
	
		/*
		int a=5;
		
		
	
		
		if (a%2==0) {
			System.out.println("Broj je paran");
		}
		else
			System.out.println("Broj je neparan");
		
		
		
		
		int prvi = 10;
		int drugi = 15;
		int treci = 11;
		
		if (prvi>drugi && prvi>treci) {
			System.out.println("Prvi broj je najveci!");
		}
			else if (drugi>prvi && drugi>treci) {
				System.out.println("Treci broj je najveci!");
			}
			else if (treci<prvi && treci>drugi) {
				System.out.println("Treci broj je najveci!");
				
				
		
		
		int a = 47;
		
		if (a==0 || a<=25) {
		
		System.out.println("Broj je izmedju 0 i 25");
		}
		else if (a==26 || a<=50) {
			System.out.println("Broj je izmedju 25 i 50");
		}
		else 
			System.out.println("Broj je izvan opsega");
		
		
		
		int day = 22;
		int month = 7;
		int today1 = 22;
		int today2 = 5;
		
		if (month>today2) {
			System.out.println("Rodjendan treba da bude ove godine");
		}
			else if (month==today2 && day>today1) {
			System.out.println("Rodjendan treba da bude ove godine");
			}
			else if (month==today2 && day<today1) {
				System.out.println("Rodjendan je prosao");
				}
			else if (month<today2 ) {
			System.out.println("Rodjendan je prosao."); 
			}
			
			else if (month == today2 && day == today1 ) {
				System.out.println("Sretan rodjendan");
			}
			
		
		
		int year = 2016;
		
		if (year%400==0 || year%100==0 || year%4==0) {
			
			System.out.println("Godina je prestupna");
		}
			else 
				System.out.println("Godina nije prestpuna");
		}
		
		*/
		
		int day = 29;
		int month = 11;
		
		if (day>=31 && month<12) {
			
		System.out.println("1."+ ++month);
		}
		
		else if (day>=31 && month>=12) {
			System.out.println("1.1");
		}
		else if (month!=2 &&month!=4 &&month!=6 &&month!=9 && month!=11) {
			System.out.println(++day +"."+month);
		}
		else if (month==2 && day>=28) {
			System.out.println("1."+ ++month);
		}
		else if (month==2 && day<28) {
			System.out.println(++day +"." +month);
		}
		else if (day>=30 && month==4 ) {
			System.out.println("1."+ ++month);
		}
		else if (month==4   && day<30) {
			System.out.println(++day +"." +month);
		}
		
		else if (day>=30 && month==6 ) {
			System.out.println("1."+ ++month);
		}
		else if (month==6   && day<30) {
			System.out.println(++day +"." +month);
		}
		else if (day>=30 && month==9 ) {
			System.out.println("1."+ ++month);
		}
		else if (month==9   && day<30) {
			System.out.println(++day +"." +month);
		}
		else if (day>=30 && month==11 ) {
			System.out.println("1."+ ++month);
		}
		else if (month==11   && day<30) {
			System.out.println(++day +"." +month);
		}
			else if (month==4 || month==6 || month==9 || month==11 && day>=30) {
				System.out.println("1."+ ++month);
			
			
		}
		
		
		
	}
}
				
		 
		
		
		
		
	

	


