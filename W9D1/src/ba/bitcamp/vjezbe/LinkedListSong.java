package ba.bitcamp.vjezbe;

public class LinkedListSong {

	private Node start;
	private static int counter = 0;

	public LinkedListSong() {
		start = null;
	}

	public LinkedListSong(Song[] s) {
		for (int i = 0; i < s.length; i++) {
			counter++;
			add(s[i]);
		}
	}

	public void add(Song s) {
		if (start == null) {
			start = new Node(s);
		} else {
			Node last = getLastNode();

			last.setNextNode(new Node(s));
		}
	}

	public Song get(int index) {
		Node temp = start;

		for (int i = 0; i < index; i++) {
			temp = temp.getNextNode();
		}

		return temp.getSong();
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

	public void remove(int index) {
		Node temp = start;
		for (int i = 0; i < index; i++) {
			temp = temp.getNextNode();
		}

		Node previous = getPreviousNode(temp);

		previous.setNextNode(temp.getNextNode());
		counter--;
	}

	public void remove(Song s) {
		Node temp = start;
		for (int i = 0; i < counter; i++) {
			if (temp.song.equals(s)) {
				remove(i);
				break;
			} else {
				temp = temp.getNextNode();
			}
		}
	}

	public int indexOf(Song s) {
		Node temp = start;
		for (int i = 0; i < counter; i++) {
			if (temp.song.equals(s)) {
				return i;
			}
		}
		return -1;
	}

	public void clear() {
		start = null;
	}

	public int getSize() {

		return counter;
	}

	public Node getPreviousNode(Node n) {
		if (n == start) {
			return null;
		}

		Node temp = start;
		while (temp.getNextNode() != n) {
			temp = temp.getNextNode();
		}

		return temp;
	}

	@Override
	public String toString() {
		if (start == null) {
			return "The list is empty";
		}

		return start.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedListSong other = (LinkedListSong) obj;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		return true;
	}

	private class Node {
		private Song song;
		private Node next;

		public Node(Song s) {
			this.song = s;
		}

		public Song getSong() {
			return song;
		}

		public Node getNextNode() {
			return next;
		}

		public void setNextNode(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {
			if (next == null) {
				return song + "";
			}

			return song + " " + next.toString();
		}
	}
}
