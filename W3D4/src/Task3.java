import java.io.ObjectInputStream.GetField;

public class Task3 {

	public static boolean canBeBinary(int num) {
		int div = 1;

		for (int i = num; i != 0; i /= 10) {

			div = i % 10;
			if (div > 1 || div < 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(canBeBinary(128));

	}

}
