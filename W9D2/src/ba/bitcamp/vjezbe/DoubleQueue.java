package ba.bitcamp.vjezbe;

import java.util.Arrays;

public class DoubleQueue {
	String[] arr;

	public DoubleQueue() {
		arr = new String[0];
	}

	public boolean add(String e) {

		String[] newArr = Arrays.copyOf(arr, arr.length + 1);
		newArr[newArr.length - 1] = e;
		arr = newArr;
		return true;
	}

	public String poll() {
		if (arr.length == 0) {
			return null;
		} else {
			String temp = arr[0];
			String[] newArr = Arrays.copyOfRange(arr, 1, arr.length - 1);
			newArr[0] = temp;
			arr = newArr;

			return arr[0];
		}
	}

	public String peek() {
		if (arr.length == 0) {
			return null;
		} else {
			return arr[0];
		}
	}

	public String toString() {
		return Arrays.toString(arr);
	}

}
