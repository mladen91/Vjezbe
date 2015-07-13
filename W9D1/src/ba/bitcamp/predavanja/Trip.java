package ba.bitcamp.predavanja;

public class Trip {


	private Place start;

	
	public Trip(Place start) {
		super();
		this.start = start;
		
	}


	
	
	
	public Place getStart() {
		return start;
	}





	public void setStart(Place start) {
		this.start = start;
	}
	
	public void add(Place newPlace) {
		
		
		if (start == null){
			start= newPlace;
		}else {
			Place last = start;
		}
		
	}





//	public String toString() {
//		return "Trip from " + start + " to ";
//	}
}
