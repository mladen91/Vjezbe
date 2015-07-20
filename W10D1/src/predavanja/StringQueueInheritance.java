package predavanja;

import java.util.LinkedList;

public class StringQueueInheritance extends LinkedList<String>{

	private static final long serialVersionUID = -2371969446649614134L;

	public void enqueue(String val) {
		add(0, val);
	}
	
	public String dequeue() {
		return remove(size()-1);
	}
}
