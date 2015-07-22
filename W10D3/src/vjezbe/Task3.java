package vjezbe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.JFileChooser;

public class Task3 {

	public static void main(String[] args) {
		JFileChooser open = new JFileChooser();

		BufferedReader in;
		String s;
		TreeSet<Integer> tree = new TreeSet<Integer>();

		int action = open.showOpenDialog(null);

		if (action == JFileChooser.APPROVE_OPTION) {
			File f = open.getSelectedFile();
			try {
				in = new BufferedReader(new FileReader(f));

				while (in.ready()) {
					String line = in.readLine();

					StringTokenizer st = new StringTokenizer(line, " ");
					while (st.hasMoreTokens()) {
						try {
							
							int a = Integer.parseInt(st.nextToken());
							tree.add(a);

						} catch (NumberFormatException e) {

						}
					}
				}

			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(tree.descendingSet());
		}

	}
}
