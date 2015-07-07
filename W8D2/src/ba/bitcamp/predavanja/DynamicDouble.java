package ba.bitcamp.predavanja;

import java.util.Arrays;

public class DynamicDouble {
	private double myArray[];
	private int count;

	public DynamicDouble(int n, double x) {
		super();
		this.myArray = new double[n];
		this.count = n;

		for (int i = 0; i < n; i++) {
			this.myArray[i] = x;
		}
	}

	public DynamicDouble(int n) {
		this(n, 0.0);
		this.count = 0;
	}

	public DynamicDouble() {
		this(8);
	}

	public void add(double item) {

		if (count == myArray.length)

			myArray = Arrays.copyOf(myArray, 2 * myArray.length);

		myArray[count] = item;
		count++;

	}

	public void add(double[] xs) {
		double[] tmp = myArray;
		myArray = new double[myArray.length + xs.length];

		for (int i = 0; i < tmp.length; i++) {
			myArray[i] = tmp[i];
		}

		for (int i = 0; i < xs.length; i++) {
			myArray[tmp.length + i] = xs[i];
		}

		count = myArray.length;
	}

	public double size() {
		return count;
	}

	public double totalSize() {
		return myArray.length;
	}

	public void remove(int index) {

		if (index < 0 || index >= count)

			throw new ArrayIndexOutOfBoundsException("Out of bounds: " + index);

		for (int j = index + 1; j < count; j++) {
			myArray[j - 1] = myArray[j];

			count--;
		}

	}
	
	
	

	@Override
	public String toString() {

		String s = size() + "\t [";
		for (int i = 0; i < count; i++) {
			s += myArray[i] + ", ";
		}
		s += "] \n" + totalSize() + "\t [";
		for (int i = 0; i < totalSize(); i++) {
			s += myArray[i] + ", ";
		}

		s += "]";
		return s;
	}

	public static void main(String[] args) {

		DynamicDouble d = new DynamicDouble();
		System.out.println(d.toString());
		d.add(2);
		System.out.println(d.toString());
		
		

	}

}
