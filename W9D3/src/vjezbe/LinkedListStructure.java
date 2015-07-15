package vjezbe;

import java.util.Collection;
import java.util.Iterator;

public class LinkedListStructure implements Collection<LinkedListStructure> {

	private Node start;
	private int size = 0;

	public void add(int value) {
		if (start == null) {
			start = new Node(value);
		} else {

			Node last = getLastNode();

			last.setNext(new Node(value));
		}
		size++;
	}

	private Node getLastNode() {
		if (start == null) {
			return null;
		}

		Node temp = start;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		return temp;
	}

	@Override
	public int size() {

		return size;

	}

	@Override
	public boolean isEmpty() {
		return start == null;
	}

	@Override
	public boolean contains(Object o) {
		int value = (int) (o);
		Node temp = start;
		if (temp.getValue() == value) {
			return true;
		}
		while (temp.getNext() != null) {

			temp = temp.getNext();
			if (temp.getValue() == value) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Iterator<LinkedListStructure> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(LinkedListStructure e) {

		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends LinkedListStructure> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		start = null;

	}

	public class Node {
		private Node next;
		private int value;

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node(int value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {

	}

}
