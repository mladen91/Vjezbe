package ba.bitcamp.vjezbe.task2;

import ba.bitcamp.vjezbe.task1.DesktopComputer;
import ba.bitcamp.vjezbe.task1.Laptop;
import ba.bitcamp.vjezbe.task1.PersonalComputer;

public class MainComputer {

	public static void main(String[] args) {
		
		DesktopComputer dc = new DesktopComputer("Windows", 8, 1100, 4*4.4, 600, 1000, 2, false, true);
		
		dc.printInformation();

	}

}
