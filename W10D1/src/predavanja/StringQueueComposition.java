package predavanja;

import java.util.LinkedList;

public class StringQueueComposition {

	private LinkedList<String> values;
	
	public StringQueueComposition(){
		values = new LinkedList<String>();
	}
	
	public int size() {
		return values.size();
	}
	
	public void enqueue(String val) {
		values.add(0, val);
	}
	
	public String dequeue() {
		return values.remove(size()-1);
	}
}
