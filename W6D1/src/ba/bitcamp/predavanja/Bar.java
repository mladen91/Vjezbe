package ba.bitcamp.predavanja;

public class Bar implements Compare {

	String name;

	public Bar(String name) {
		this.name = name;
	}

	public int compare(Bar other) {

		if (this.name.length() > other.name.length()) {
			return 1;
		} else if (this.name.length() == other.name.length()) {
			return 0;
		} else
			return -1;
	}
	
	public String toString(){
		return "Bar: " + name;
	}

	public int compare(Object o) {
		if (o instanceof Bar){
			Bar other = (Bar)o;
			if (this.name.length() > other.name.length()) {
				return 1;
			} else if (this.name.length() == other.name.length()) {
				return 0;
			} else
				return -1;
		}
		return 0;
	}

}
