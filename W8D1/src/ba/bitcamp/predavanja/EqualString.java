package ba.bitcamp.predavanja;

public class EqualString {

	private static boolean isEqual(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		int[] syns = new int[255];
		for (int i = 0; i < syns.length; i++) {
			for (int j = 0; j < str1.length(); j++) {
				if (i == str1.charAt(j)) {
					syns[i]++;
				}
				if (i == str2.charAt(j)) {
					syns[i]++;
				}
			}
		}
		return true;
	}
	
	private static boolean isSubstring(String str1, String str2) {

		str1+=str1;
		return str1.indexOf(str2)>-1;
	}
	
	

	public static void main(String[] args) {
		String str1 = "vozdra";
		String str2 = "zdrav ";
		System.out.println(isEqual(str1, str2));
		System.out.println(isSubstring(str1,str2));

	}

}
