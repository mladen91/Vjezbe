public class Task1 {

	public static int getMax(int num1, int num2) {
		int max=0;
		if (num1 > num2) {
			 max = num1;
		} else if (num1 < num2) {
			 max = num2;
		}
		return max;
		

		
	}

	public static void main(String[] args) {

		System.out.println(getMax(5, 4));

	}

}
