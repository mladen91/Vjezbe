package vjezbe;

import java.io.Serializable;

public class Application implements Serializable  {

	
	private static final long serialVersionUID = 2321002059355538491L;
	private String name;
	private int yearOfRelease;
	private double version;
	private int size;

	public Application(String name, int yearOfRelease, double version, int size) {
		super();
		this.name = name;
		this.yearOfRelease = yearOfRelease;
		this.version = version;
		this.size = size;
	}

	public String toString() {
		return "Application name: " + name + "\nYear of release: "
				+ yearOfRelease + "\nVersion: " + version + "\nSize: " + size;
	}

}
