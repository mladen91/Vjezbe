package vjezbe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader {

	public static void listSalary(ArrayList<Worker> w) {
		ArrayList<Worker> w1 = new ArrayList<Worker>();
		for (int i = 0; i < w.size(); i++) {
			if (Integer.parseInt(w.get(i).getSalary()) > 5000) {
				w1.add(w.get(i));
			}
		}
		System.out.println(w1);
	}

	public static void listID(ArrayList<Worker> w) {
		ArrayList<Worker> w1 = new ArrayList<Worker>();
		for (int i = 0; i < w.size(); i++) {
			if (Integer.parseInt(w.get(i).getSalary()) < 5000
					&& Integer.parseInt(w.get(i).getID()) > 2) {
				w1.add(w.get(i));
			}
		}
		System.out.println(w1);
	}

	public static void listNames(ArrayList<Worker> w) {
		ArrayList<String> w1 = new ArrayList<String>();
		for (int i = 0; i < w.size(); i++) {

			w1.add(w.get(i).getName());

		}
		System.out.println(w1);
	}

	public static void listNamesSalary(ArrayList<Worker> w) {
		ArrayList<String> w1 = new ArrayList<String>();
		for (int i = 0; i < w.size(); i++) {

			w1.add(w.get(i).getName());
			w1.add(w.get(i).getSalary());

		}
		System.out.println(w1);
	}

	public static void listNamesAndManagers(ArrayList<Worker> w,
			ArrayList<Menager> m) {
		ArrayList<String> workersManagers = new ArrayList<String>();

		for (int i = 0; i < m.size(); i++) {
			for (int j = 0; j < m.size(); j++) {
				if (w.get(i).getID().equals(m.get(i).getId())) {
					System.out.println(w.get(i).getName() + " : "
							+ m.get(i).getName());
				}
			}
		}
	}

	public static void main(String[] args) {

		try {
			ArrayList<Worker> workers = new ArrayList<Worker>();
			BufferedReader br = new BufferedReader(new FileReader("mladen.csv"));
			String s = "";
			while ((s = br.readLine()) != null) {
				String[] arr = s.split(",");
				Worker w = new Worker(arr[0].trim(), arr[1], arr[2].trim());
				workers.add(w);

			}

			BufferedReader managerReader = new BufferedReader(new FileReader(
					"menager.csv"));
			String managerString = "";
			ArrayList<Menager> menagers = new ArrayList<Menager>();
			while ((managerString = managerReader.readLine()) != null) {
				String[] arr1 = managerString.split(",");
				Menager m = new Menager(arr1[0], arr1[1].trim());
				menagers.add(m);

			}
			System.out.println(menagers);
			System.out.println(workers);
			listSalary(workers);
			listID(workers);
			listNames(workers);
			listNamesSalary(workers);
			listNamesAndManagers(workers, menagers);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
