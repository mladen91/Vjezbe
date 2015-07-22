package predavanja;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		System.out.println(System.getProperty("user.home")+"\n");
		String[] files;

		File f = new File(System.getProperty("user.home"));

		if (!f.exists()) {
			if (!f.isDirectory()) {
				System.out.println("Not a directory");
			} else {
				System.out.println("No such directory");
			}
		} else {

			files = f.list();

			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i]);
			}

			System.out.println();

			System.out.println("There is " + files.length
					+ " in this directory");

		}

	}

}
