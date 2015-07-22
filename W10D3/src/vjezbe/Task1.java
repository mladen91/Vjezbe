package vjezbe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;

public class Task1 {

	public static void main(String[] args) throws IOException {
		
        ArrayList<Employee> list = new ArrayList<Employee>(); 
		JFileChooser open = new JFileChooser();
		
		BufferedReader in = null;
		Employee e;
		
		int action = open.showOpenDialog(null);
		
		if (action == JFileChooser.APPROVE_OPTION) {
			File f = open.getSelectedFile();
			in = new BufferedReader( new FileReader(f));
			in.readLine();
			
			while (in.ready()) {
				String line = in.readLine();
				StringTokenizer st = new StringTokenizer(line, ",");
				
				String name = st.nextToken();
				String surname = st.nextToken(); 
				String gender = st.nextToken();
				String position = st.nextToken();
				String salary = st.nextToken();
				
				
				
				 e = new Employee(name, surname, gender, position, salary);
				
				System.out.println("Name: " + name + " Surname: " + surname
						+ " Gender: " + gender + " Position: " + position
						+ " Salary: " + salary);
				list.add(e);
				e.sort(list);
				
				
				
				
				
			}
			
			
			
			System.out.println(list);
			
		}

	}
	
	
	
	

	

}
