package ba.bitcamp.vjezbe;

public class MainPrinter {

	public static void main(String[] args) {

		Printer p1 = new Printer();
		// Adding ink to printer
		p1.addInk();
		// Adding paper to printer
		p1.addPaper(100);
		// getting printer status
		System.out.println(p1);
		// Printing pages
		p1.printPages(50);
		System.out.println("Number of printed pages: "
				+ Printer.getPrintedPaper());

	}

}
