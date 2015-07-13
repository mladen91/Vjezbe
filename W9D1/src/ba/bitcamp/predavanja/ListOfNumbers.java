package ba.bitcamp.predavanja;

import java.util.Scanner;

public class ListOfNumbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Node head = null;
		Node last = null;

		System.out.println("unesi brojeve");

		while (true) {

			int n = in.nextInt();

			if (n > 0) {

				Node newNode = new Node(n);

				if (head == null && last == null) {

					head = newNode;
					last = newNode;
					
				} else {

					last.setNext(newNode);
					last = newNode;
				}

			} else {

				break;

			}

		}

		int length = 0;

		Node currentNode = head;
		int sum = 0;

		while (currentNode != null) {

			length++;

			sum += currentNode.getValue();
			currentNode=currentNode.getNext();

		}

		System.out.println("Unijeli ste : " + length);

		System.out.println("Suma brojeva je: " + sum);

	}

}
