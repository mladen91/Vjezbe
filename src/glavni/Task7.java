package glavni;

public class Task7 {

	public static void main(String[] args) {
		int day = 30;
		int month = 4;

		if (day >= 31 && month < 12) {

			System.out.println("1." + ++month);
		}

		else if (day >= 31 && month >= 12) {
			System.out.println("1.1");
		} else if (month != 2 && month != 4 && month != 6 && month != 9
				&& month != 11) {
			System.out.println(++day + "." + month);
		} else if (month == 2 && day >= 28) {
			System.out.println("1." + ++month);
		} else if (month == 2 && day < 28) {
			System.out.println(++day + "." + month);
		} else if (day >= 30 && month == 4) {
			System.out.println("1." + ++month);
		} else if (month == 4 && day < 30) {
			System.out.println(++day + "." + month);
		}

		else if (day >= 30 && month == 6) {
			System.out.println("1." + ++month);
		} else if (month == 6 && day < 30) {
			System.out.println(++day + "." + month);
		} else if (day >= 30 && month == 9) {
			System.out.println("1." + ++month);
		} else if (month == 9 && day < 30) {
			System.out.println(++day + "." + month);
		} else if (day >= 30 && month == 11) {
			System.out.println("1." + ++month);
		} else if (month == 11 && day < 30) {
			System.out.println(++day + "." + month);
		} else if (month == 4 || month == 6 || month == 9 || month == 11
				&& day >= 30) {
			System.out.println("1." + ++month);

		}

	}

}
