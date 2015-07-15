package vjezbe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Planet implements Comparable<Planet> {

	private String name;
	private int diameter;
	private int mass;
	private int distanceAU;

	public Planet(String name, int diameter, int mass, int distanceAU) {
		super();
		this.name = name;
		this.diameter = diameter;
		this.mass = mass;
		this.distanceAU = distanceAU;
	}

	public static void sortByName(ArrayList<Planet> list) {
		list.sort(new Comparator<Planet>() {

			@Override
			public int compare(Planet p1, Planet p2) {
				return p1.name.compareTo(p2.name);
			}

		});
	}

	public static void sortByDiameter(ArrayList<Planet> list) {
		list.sort(new Comparator<Planet>() {

			public int compare(Planet p1, Planet p2) {
				return p2.diameter - p1.diameter;
			}
		});

	}

	public static void sortByMass(ArrayList<Planet> list) {
		list.sort(new Comparator<Planet>() {

			public int compare(Planet p1, Planet p2) {
				return p2.mass - p1.mass;
			}
		});

	}

	public static void sortByDistanceAU(ArrayList<Planet> list) {
		list.sort(new Comparator<Planet>() {

			public int compare(Planet p1, Planet p2) {
				return p2.distanceAU - p1.distanceAU;
			}
		});

	}

	@Override
	public int compareTo(Planet p) {
		return this.name.compareTo(p.name);

	}

	public String toString() {
		return name + " " + diameter + " " + mass + " " + distanceAU;
	}

}
