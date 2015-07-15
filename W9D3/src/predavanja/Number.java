package predavanja;

public class Number {

	
	public static int maxNumber(int[] arr){
		int max = arr[0];
		for (int i = 0; i < arr.length; i++){
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		return max;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
     int[] arr = {3,4,6,7};

     System.out.println(maxNumber(arr));
	}

}
