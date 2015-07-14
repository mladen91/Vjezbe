public class LinkedList {

	private Node start;
	private int size;

	public void add(int value) {
		if (start == null) {
			start = new Node(value);
		} else {
			Node last = getLastNode();
			last.setNextNode(new Node(value));
		}
		size++;
	}
	
	public void addOnBeginning(int value){
		if (start == null) {
			start = new Node(value);
		}else {
			Node first = new Node(value);
					first.setNextNode(start);
					start =first;
		}
	}

	public void removeFirst() {

		start = start.getNextNode();
		size--;
	}

	public void remove(int index) {

		Node temp = start;

		for (int i = 0; i < index; i++) {
			temp = temp.getNextNode();
		}

		Node previous = getPreviousNode(temp);
		previous.setNextNode(temp.getNextNode());

		size--;

	}

	private Node getPreviousNode(Node n) {
		if (start == null) {
			return null;
		}
		Node temp = start;
		while (temp.getNextNode() != n) {
			temp = temp.getNextNode();
		}
		return temp;
	}

	public void removeLast() {
		remove(size() - 1);
	}

	public int size() {
		return size;
	}

	private Node getLastNode() {

		if (start == null) {
			return null;
		}
		Node temp = start;
		while (temp.getNextNode() != null) {
			temp = temp.getNextNode();
		}

		return temp;
	}

	public String toString() {
		if (start == null) {
			return "The list is empty";
		}

		return start.toString();
	}

	public class Node {
		private Node nextNode;
		private int value;

		public Node(int value) {
			this.value = value;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public String toString() {
			if (nextNode == null) {
				return value + "";
			}
			return value + " " + nextNode.toString();
		}

	}
}
