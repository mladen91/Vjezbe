package glavni;

public class Task5 {

	public static void main(String[] args) {
		
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

	}

}
