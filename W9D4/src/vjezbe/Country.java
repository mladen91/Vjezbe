package vjezbe;

import java.util.ArrayList;
import java.util.Comparator;

public class Country implements Comparator<Country> {
	private String name;
	private int population;
	private int surface;

	public Country(String name, int population, int surface) {
		super();
		this.name = name;
		this.population = population;
		this.surface = surface;
	}

	public enum sortBy {
		NAME, POPULATION, SURFACE
	};

	public void sort(ArrayList<Country> c, sortBy s) {
		if (s == s.NAME) {
			c.sort(new Comparator<Country>() {

				@Override
				public int compare(Country c1, Country c2) {
					return c1.name.compareTo(c2.name);
				}

			});
		}

		if (s == s.POPULATION) {
			c.sort(new Comparator<Country>() {

				@Override
				public int compare(Country p1, Country p2) {
					return p2.population - p1.population;
				}

			});
		}

		if (s == s.SURFACE) {
			c.sort(new Comparator<Country>() {

				@Override
				public int compare(Country p1, Country p2) {
					return p2.surface - p1.surface;
				}

			});
		}
	}

	@Override
	public int compare(Country o1, Country o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString(){
		return name+" "+population+" "+surface+"\n";
	}

}
