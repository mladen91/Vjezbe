package glavni;

public class Task3 {

	public static void main(String[] args) {
		
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
			}

	}

}
