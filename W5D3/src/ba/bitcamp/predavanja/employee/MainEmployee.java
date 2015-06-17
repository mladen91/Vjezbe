package ba.bitcamp.predavanja.employee;

public class MainEmployee {

	public static void main(String[] args) {
		
		Employee e = new Employee ("John","Doe");
		System.out.println(e);
		
		SalaryEmployee se = new SalaryEmployee("Sue", "Female", 100);
		System.out.println(se);

	}

}
