package vjezbe;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Country c1 = new Country("BIH", 5000000, 1500000);
		Country c2 = new Country("CRO", 15000000, 1500000);
		Country c3 = new Country("SRB", 1000000, 1500000);
		Country c4 = new Country("MKD", 2000000, 1500000);
		Country c5 = new Country("SLO", 3000000, 1500000);

		ArrayList<Country> countries = new ArrayList<Country>();
		countries.add(c1);
		countries.add(c2);
		countries.add(c3);
		countries.add(c4);
		countries.add(c5);
		c1.sort(countries, Country.sortBy.NAME);

		System.out.println(countries);

	}

}
