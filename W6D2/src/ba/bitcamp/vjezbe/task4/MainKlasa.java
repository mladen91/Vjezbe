package ba.bitcamp.vjezbe.task4;

import ba.bitcamp.vjezbe.part2.task2.ArrayManipulation;
import ba.bitcamp.vjezbe.task1.Computer;
import ba.bitcamp.vjezbe.task2.Network;
import ba.bitcamp.vjezbe.task3.Server;

public class MainKlasa {

	public static void main(String[] args) {

		char[] m1 = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8',
				'9', 'a', 'b' };
		char[] m2 = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8',
				'9', 'c', 'b' };
		Client c1 = new Client("PC1", m1);
		Client c2 = new Client("PC2", m2);
		System.out.println(c1.getMacAddress());
		Computer[] arrComp = new Computer[2];
		Server s1 = new Server("PC", m1, 3);
		arrComp[0] = c1;
		arrComp[1] = c2;

		c1.connect(s1);
		c1.disconnect();
		c1.connect(s1);

		System.out.println(c1);
		ArrayManipulation.shrinkArray(arrComp,1);
	}

}
