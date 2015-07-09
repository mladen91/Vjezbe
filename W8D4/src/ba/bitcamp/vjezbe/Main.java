package ba.bitcamp.vjezbe;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee(1500, "Ajdin", "Brkic", true, 4, 11, 1994);
		Employee e2 = new Employee(1000, "Semir", "Sahman", true, 1, 11, 1994);
		Employee e3 = new Employee(1300, "Edvin", "Mulabdic", true, 05, 10,
				1989);
		Employee e4 = new Employee(1800, "Radnica", "Prezime", false, 05, 10,
				1989);

		Company c = new Company();
		c.hireEmployee(e1);
		c.hireEmployee(e2);
		c.hireEmployee(e3);
		c.hireEmployee(e4);
		System.out.println(c.isWorkingHere(e1));
		System.out.println(c.hasFamaleEmployees());
		c.sortByID();
//		c.sortByAge();
//		c.sortBySalary();
//		c.sortByGender();
		c.getEmployee(1002);

		System.out.println(c.areEmployeesSortedByID());
		//System.out.println(c);
	}

}
