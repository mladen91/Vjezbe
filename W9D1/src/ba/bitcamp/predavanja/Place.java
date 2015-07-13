package ba.bitcamp.predavanja;

public class Place {

		private String name;
		private Place next;

		public Place(String name) {
			super();
			
		}
		
		public String toString(){
			return name;
		}

		public Place getNext() {
			return next;
		}

		public void setNext(Place next) {
			this.next = next;
		}

		
		
		
}
