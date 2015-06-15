package ba.Vjezbe;

public class Task4 {

	/**
	 * <h1>Calculating sum from args array.
	 * 
	 * @param args - We will get sum using args array.
	 */
	
	public static void main(String[] args) {
	
		int sum=0;
		
		for (int i=0;i<args.length;i++) {
			int a=Integer.parseInt(args[i]);
			sum+=a;
		}
		System.out.println(sum);

	}
	
	
	
	

}
