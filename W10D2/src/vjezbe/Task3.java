package vjezbe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) {

		Application app = new Application("Photo Editor", 2015, 1.5, 50);
		Application app1 = new Application("App Editor", 2015, 1.8, 70);
		Application app2 = new Application("Movie Editor", 2015, 2.0, 50);

		ArrayList<Application> apps = new ArrayList<Application>();

		apps.add(app);
		apps.add(app1);
		apps.add(app2);

		try {
			OutputStream os = new FileOutputStream("task3.txt", true);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(apps);

			InputStream is = new FileInputStream("task3.txt");
			ObjectInputStream ois = new ObjectInputStream(is);
			ArrayList<Application> fromFile = (ArrayList<Application>) ois
					.readObject();
			System.out.println(fromFile);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex1) {
			ex1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
