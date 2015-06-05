
public class Task1 {

	public static String merge (String s1, String s2) {
		
		String s3=s2.substring(0, s2.length()/2);
		String s4=s3+s1+s2.substring(s2.length()/2);
			
		return s4;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(merge("mladen", "ludilo"));

	}

}
