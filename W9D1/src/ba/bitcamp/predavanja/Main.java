package ba.bitcamp.predavanja;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Place head = null;
		Place last = null;
		
		System.out.println("Insert your Locations:");
		
		while (true) {

			String n = in.nextLine();

			if (!n.equals("0")) {

				System.out.println("Insert place where u want to go:");
				Place newNode = new Place(n);

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

		//Trip t = new Trip(head);

		Place currentNode = head;
		System.out.println("Na putu cete proci kroz");

		while (currentNode != null) {

			currentNode = currentNode.getNext();
			System.out.println(currentNode);
		}

		in.close();

	}

}
