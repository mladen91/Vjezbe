package Vjezbe;

public class Task1 {

	public static boolean isSingular(int[][] matrix) {

		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		ZagrijavanjeTask1.insertInto2D(matrix);
		ZagrijavanjeTask1.print2D(matrix, 3);

		sum = matrix[0][0]
				* (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
				- matrix[0][1]
				* (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
				+ matrix[0][2]
				* (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
		System.out.println(sum);

		if (sum == 0) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {

		int[][] matrix = new int[3][3];

		System.out.println(isSingular(matrix));
	}

}
