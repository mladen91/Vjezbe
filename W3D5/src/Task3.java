public class Task3 {

	public static String getTheRest(String s1, String s2) {
		String s4 = "";
		int s = s1.indexOf(s2.charAt(0));
		if (s > 0) {
			s4 = s1.substring(s);
		}
		String s3 = Integer.toString(s);

		return s4;
	}

	public static void main(String[] args) {

		System.out.println(getTheRest("Mladen", "d"));

	}

}
