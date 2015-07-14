package ba.bitcamp.vjezbe;

public class StringStackLink {

	private Node start;

	public StringStackLink() {
		start = null;
	}

	public void push(String e) {

		if (start == null) {
			start = new Node(e);
		} else {
			Node first = new Node(e);
			first.setNextNode(start);
			start = first;
		}

	}

	public String toString() {
		if (start == null) {
			return "The list is empty";
		}

		return start.toString();
	}

	public String pop() {
		String value = start.getValue();
		if (start == null) {
			return "The list is empty";
		}
		start = start.getNextNode();

		return value;
	}

	public String peek() {

		if (start == null) {
			return "The list is empty";
		}

		return start.getValue();
	}

	public boolean isEmpty() {
		if (start == null) {
			return true;
		} else {
			return false;
		}
	}

	public int search(String s) {
		if (start == null) {
			return -1;
		}
		int counter = 0;
		Node temp = start;

		while (temp.getNextNode() != null) {
			counter++;
			if (temp.getValue().equals(s)) {
				return counter;
			}
			temp = temp.getNextNode();

		}

		return -1;
	}

	public class Node {
		private String value;
		private Node nextNode;

		public Node(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

		public String toString() {
			if (nextNode == null) {
				return value;
			}
			return value + " " + nextNode.toString();
		}
	}

}
