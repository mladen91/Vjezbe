package predavanja;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class Main {

	private static void printByteArray(byte[] arr) {
		for (byte b : arr) {
			System.out.print((char) b);
		}
		System.out.println();
	}

	private static void printCharArray(char[] arr) {
		for (char b : arr) {
			System.out.print((char) b);
		}
		System.out.println();
	}

	public static void firstPart() {
		InputStream in = null;
		OutputStream os = null;

		try {
			in = System.in;
			os = new FileOutputStream("copynesto.txt", true);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return;
		}

		byte[] buffer = new byte[3];

		try {
			int read = 0;
			do {
				read = in.read(buffer);

				os.write(buffer, 0, read);

			} while (in.available() > 0);

			String message = "Hello World";
			buffer = message.getBytes();

			os.write(buffer);

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("\nDone");

	}
	
	public static void partTwo(){
		InputStream is = null;
		OutputStream os = System.out;
		try {
			is = new FileInputStream("nesto.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Reader r = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(r);

		Writer w = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(w);

		PrintWriter pw = new PrintWriter(System.out);

		String s = null;
		try {

			while ((s = br.readLine()) != null) {
				pw.println(s);
			}
			pw.flush();
		} catch (IOException e) {

			e.printStackTrace();

		}
	}

	public static void main(String[] args) {

		User u = new User("John", 26);
		OutputStream os=null;
		ObjectOutputStream oos=null; 
		
		
		try{
			oos= new ObjectOutputStream(os);
			os = new FileOutputStream("user.dat", true);
			InputStream is = new FileInputStream("user.dat");
			oos.writeObject(u);
			ObjectInputStream ois = new ObjectInputStream(is);
			User fromFile = (User)ois.readObject();
			System.out.println(fromFile);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException ex1) {
			ex1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
