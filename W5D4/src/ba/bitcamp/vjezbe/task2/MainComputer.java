package ba.bitcamp.vjezbe.task2;

import ba.bitcamp.vjezbe.task1.DesktopComputer;
import ba.bitcamp.vjezbe.task1.Laptop;
import ba.bitcamp.vjezbe.task1.PersonalComputer;

public class MainComputer {

	public static void main(String[] args) {
		
		PersonalComputer dc1 = new DesktopComputer();
		
		System.out.println(dc1 instanceof DesktopComputer);
		
		DesktopComputer dc1t = (DesktopComputer) dc1;
		
		
		Laptop l1 = new Laptop();
		System.out.println(dc1);
		System.out.println(l1);

	}

}
