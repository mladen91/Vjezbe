package vjezbe;

public class Menager {

	private String id;
	private String name;

	public Menager(String id, String name) {

		this.id = id;
		this.name = name;
	}

	public String getId(){
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return id + " " + name;
	}
	
	

}
