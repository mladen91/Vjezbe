package ba.bitcamp.vjezbe;

import java.util.Arrays;

public class StringStack {

	String[] arr;

	public StringStack() {
		arr = new String[0];
	}

	public void push(String e) {
		String[] newArr = Arrays.copyOf(arr, arr.length + 1);
		newArr[newArr.length - 1] = e;
		arr = newArr;
	}

	public String pop() {
		String[] newArr = Arrays.copyOf(arr, arr.length - 1);
		arr = newArr;
		return arr[arr.length - 1];
	}

	public String peek() {
		return arr[arr.length - 1];
	}

	public boolean isEmpty() {
		if (arr.length == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int search(String s) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(s)) {
				return i;
			}
		}
		return -1;
	}

	public String toString() {
		return Arrays.toString(arr);
	}

}
