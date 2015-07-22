package vjezbe;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee implements Comparator<Employee>  {

	private String name;

	private String surname;

	private String gender;

	private String position;

	private String salary;

	public Employee(String name, String surname, String gender,
			String position,

			String salary) {

		super();

		this.name = name;

		this.surname = surname;

		this.gender = gender;

		this.position = position;

		this.salary = salary;

	}

	@Override
	public String toString() {

		return "Employee [name=" + name + ", surname=" + surname + ", gender="

		+ gender + ", position=" + position + ", salary=" + salary

		+ "]";

	}
	
	public void sort(ArrayList<Employee> e) {
		
			e.sort(new Comparator<Employee>() {

				@Override
				public int compare(Employee e1, Employee e2) {
					return e1.name.compareTo(e2.name);
				}

			});

	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
