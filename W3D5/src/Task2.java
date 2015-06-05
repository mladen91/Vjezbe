
public class Task2 {

	public static String getFirst (String s1, String s2, String s3) {
		
		if (s1.compareTo(s2)<=0) {			
			if (s2.compareTo(s3)<=0)
			return s1;
		}  	else 
			return s2;	
		if (s1.compareTo(s3)<=0){
				return s3;	
				}
		
		return " ";
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(getFirst("Ait", "Camp", "Bava"));

	}

}
