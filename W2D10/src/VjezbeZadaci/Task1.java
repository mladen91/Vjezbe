package VjezbeZadaci;

public class Task1 {

	
		

		
		public static int getSum(int a,int b,int c) {
		int sum = 0;
		for (int i=1; i<=a;i++) {
			sum+=i;
		}
		for (int i=1; i<=b;i++) {
			sum+=i;
		}
		for (int i=1; i<=c;i++) {
			sum+=i;
		}
		return sum;
		}
		
		
		public static void main(String[] args) {
			
			int sum = getSum(11,11,3);
			System.out.println(sum);
			
		

		
		

	}

}
