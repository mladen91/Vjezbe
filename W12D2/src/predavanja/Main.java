package predavanja;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;

public class Main {

	public static void main(String[] args) throws IOException {

		JFileChooser chooser = new JFileChooser();
		int choose = chooser.showOpenDialog(null);
		BufferedReader in = null;
		ArrayList<String> list = new ArrayList<>();

		if (choose == chooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			in = new BufferedReader(new FileReader(file));

			while (in.ready()) {
				String line = in.readLine();
				StringTokenizer st = new StringTokenizer(line, ",");
				while (st.hasMoreTokens()) {
					String word = st.nextToken();
					list.add(word);
				}

			}
		}

		Scanner ins = new Scanner(System.in);
		System.out.println("Insert word: ");
		String s = ins.nextLine();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains(s)) {
				System.out.println("True");
				break;
			}
		}
	}
}
