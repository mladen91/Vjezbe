package Vjezbe;

public class Website {

	public static void main(String[] args) {

		String s = "http://primjer.net/homepage";
		int stringLength = s.length();
		String site = "";

		int counter = 0;
		for (int i = stringLength - 1; i > 0; i--) {
			char reader = s.charAt(i);
			if (reader != '/') {
				counter++;
			} else if (reader == '/') {

				break;
			}

		}
		counter = counter + 2;

		for (int j = stringLength - counter; j > 0; j--) {
			char reader = s.charAt(j);
			if (reader != '/') {
				site = reader + site;
				
			} else 
			{
				break;
			}
		}
		System.out.println(site);

	}

}
