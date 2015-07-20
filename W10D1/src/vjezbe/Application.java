package vjezbe;

public class Application {

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
