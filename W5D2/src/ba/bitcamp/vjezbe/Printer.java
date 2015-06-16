package ba.bitcamp.vjezbe;

public class Printer {

	private String printerName;
	private int paperQuantity;
	private int inkQuantity;
	private int printedPagesTotal;
	private static int totalPages;

	// Creating empty constructor
	public Printer() {
		printerName = "DefaultPrinter";
		paperQuantity = 0;
		inkQuantity = 0;
		printedPagesTotal = 0;
	}

	// Creating constructor that initialize parameter printerName, paper
	// quantity and ink quantity
	public Printer(String pName) {
		printerName = pName;
		paperQuantity = 0;
		inkQuantity = 0;
		printedPagesTotal = 0;
	}

	/**
	 * <h1>This method checks if there is ink in printer</h1>
	 * <p>
	 * 
	 * @return true if there is ink in printer, if not return false
	 */
	public boolean hasInk() {
		if (inkQuantity == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * <h1>This method checks if there is paper in printer</h1>
	 * <p>
	 * 
	 * @return true if there is paper in printer, if not return false
	 */
	public boolean hasPaper() {
		if (paperQuantity == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * This method will get us total printed pages.
	 * 
	 * @return printed pages
	 */
	public int getPrintedPagesTotal() {
		return printedPagesTotal;
	}

	/**
	 * <h1>This method will add paper to printer</h1>
	 * <p>
	 * 
	 * @param newPaper
	 *            - amount of added paper
	 */
	public void addPaper(int newPaper) {
		if (paperQuantity < 100) {
			paperQuantity += newPaper;
		} else if (paperQuantity > 100) {
			paperQuantity = 100;
		}
	}

	/**
	 * <h1>This method will add max ink to printer</h1>
	 * 
	 */
	public void addInk() {
		inkQuantity = 100;
	}

	/**
	 * <h1>This method will add max ink to printer</h1>
	 * <p>
	 * 
	 * @param p
	 *            - represents printer
	 * @param pagesForPrint
	 *            - how many pages we need to print
	 */
	public void printPages(int pagesForPrint) {
		int counter = 0;
		while (counter < pagesForPrint) {
			if (paperQuantity == 0 || inkQuantity == 0 || inkQuantity == 2) {
				break;
			} else {
				paperQuantity--;
				inkQuantity -= 3;
				counter++;
				totalPages++;
			}
		}
	}

	/**
	 * Method that prints Printer state
	 */
	public String toString() {

		String output;
		if (paperQuantity > 0 && inkQuantity > 2) {
			output = "Ready";
		} else if (paperQuantity > 0 && inkQuantity < 2) {
			output = "No ink";
		} else if (paperQuantity < 0 && inkQuantity > 2) {
			output = "No paper";
		} else {
			output = "No ink nor paper";
		}
		return output;

	}

	public static int getPrintedPaper() {
		return totalPages;
	}

}
