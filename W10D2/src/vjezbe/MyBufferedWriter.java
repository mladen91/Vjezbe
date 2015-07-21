package vjezbe;

import java.io.IOException;
import java.io.OutputStream;

public class MyBufferedWriter {

	private OutputStream outputStream;

	public MyBufferedWriter(OutputStream outputStream) {
		this.outputStream = outputStream;
	}

	public void write(char c) {
		try {
			outputStream.write(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void write(int i) {
		try {
			outputStream.write(i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void write(String s) {
		try {
			for (int i = 0; i < s.length(); i++) {
				outputStream.write(s.charAt(i));
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			outputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void newLine() {
		try {
			outputStream.write(10);
			outputStream.write(13);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void flush() {
		try {
			outputStream.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
