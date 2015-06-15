package ba.Vjezbe;

public class Task1 {

	
	public static void main(String[] args) {
		try {
		System.out.println(getAreaOfSquare(-3));
		}catch (IllegalArgumentException ex) {
			System.out.println("Wrong number format.");
		}
		

	}
	/**
	 * <b><h1>This method calculates square from number a.</h1></b>
	 * 
	 * <p>
	 * 
	 * @param a - Represents inserted number.
	 * @return Square from inserted number.
	 * 
	 * @exception - If we insert number lower than 0, it will catch <i>Illegal Argument Exception</i>
	 */

	public static double getAreaOfSquare(double a) {
		
		if (a<0) {
			throw new IllegalArgumentException();
		}
		return a*a;
		
	}
	
	
	
	

}
