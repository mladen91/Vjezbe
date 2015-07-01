package ba.bitcamp.vjezbe;

import javax.swing.JOptionPane;

public class Task4 {

	public static void main(String[] args) {
		int sum = 0;
		boolean isTrue = true;
		int a;
		int choice;
		String s = "";
		while (isTrue) {
			try {
				s = JOptionPane.showInputDialog("Enter a number");
				if (s == null) {
					JOptionPane.showMessageDialog(null, "Sum = " + sum);
					System.exit(0);
				} else {
					a = Integer.parseInt(s);

					sum += a;

					choice = JOptionPane.showConfirmDialog(null,
							"Do you want to enter another number?");

					if (choice == JOptionPane.YES_OPTION) {
						a = Integer.parseInt(JOptionPane
								.showInputDialog("Enter a number:"));
						sum += a;
						choice = JOptionPane.showConfirmDialog(null, sum);
					} else if (choice == JOptionPane.NO_OPTION) {
						isTrue = false;
						JOptionPane.showMessageDialog(null, "Sum = " + sum);

					} else if (choice == JOptionPane.CANCEL_OPTION) {

						System.exit(0);

					}
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Wrong number format");
				System.exit(0);
			}
		}
	}

}
