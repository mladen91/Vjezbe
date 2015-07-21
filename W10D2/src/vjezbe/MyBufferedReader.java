package vjezbe;

import java.io.IOException;
import java.io.InputStream;

public class MyBufferedReader {

	
	private InputStream in;

	public MyBufferedReader(InputStream in) {

		this.in = in;
		
	}
	
	public int read() throws IOException{
		
			 return in.read();
		
	}
	
	public String readLine(){
		String s ="";
		int num;
		try {
			num = in.read();
			while (num !=10) {
				num = in.read();
				s+=""+(char) num;
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		return s;
		
	}
	
	public int read(char[] c) throws IOException {
		char[] arr = new char[1024];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) in.read();
		}
		
		return -1;
	}
	
	public void close(){
		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
