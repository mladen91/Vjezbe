package ba.bitcamp.predavanja;

public class Foo implements Compare, Comparable{

	int foones;

	public Foo(int foones) {
		this.foones = foones;
	}

	public int getFoones() {
		return foones;
	}

	public void setFoones(int foones) {
		this.foones = foones;
	}

	
	
//	public int compare(Foo other) {
//
//		if (this.foones > other.foones) {
//			return 1;
//		} else if (this.foones == other.foones) {
//			return 0;
//		} else
//			return -1;
//	}

	public String toString() {
		return "Foo: " + foones;
	}

	@Override
	public int compare(Object o) {

		if(o instanceof Foo){
		Foo other = (Foo)o;
		if (this.foones > other.foones) {
			return 1;
		} else if (this.foones == other.foones) {
			return 0;
		} else
			return -1;
		}else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return compare(o);
	}
	
	

}
