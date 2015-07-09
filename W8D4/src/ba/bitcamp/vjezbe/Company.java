package ba.bitcamp.vjezbe;

import java.util.ArrayList;

public class Company {

	ArrayList<Employee> employees = new ArrayList<Employee>();

	public void hireEmployee(Employee e) {

		if (!employees.contains(e)) {
			employees.add(e);
		} else {
			System.out.println("Employee is part of company!");
		}

	}

	public void fireEmployee(Employee e) {
		if (employees.contains(e)) {
			employees.remove(e);
		} else {
			System.out.println("There is no that employee in this company!");
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Company Employees: " + employees;
	}

	public boolean isWorkingHere(Employee e) {
		if (employees.contains(e)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean hasFamaleEmployees() {

		for (int i = 0; i < employees.size(); i++) {
			if (!employees.get(i).isGender()) {
				return true;
			}
		}
		return false;
	}

	public void sortByID() {

		for (int i = 0; i < employees.size() - 1; i++) {
			int index = i;
			for (int j = i + 1; j < employees.size(); j++)
				if (employees.get(j).getID() < employees.get(index).getID())
					index = j;

			Employee smallerNumber = employees.get(index);
			employees.set(index, employees.get(i));

			employees.set(i, smallerNumber);

		}
		System.out.println(employees);

	}

	public void sortByAge() {
		for (int i = 0; i < employees.size() - 1; i++) {
			int index = i;
			for (int j = i + 1; j < employees.size(); j++)
				if (employees.get(j).getDate().getYear() < employees.get(index)
						.getDate().getYear())
					index = j;

			Employee smallerNumber = employees.get(index);
			employees.set(index, employees.get(i));

			employees.set(i, smallerNumber);

		}
		System.out.println(employees);
	}

	public void sortBySalary() {

		for (int i = 1; i < employees.size(); i++) {
			Employee temp = employees.get(i);

			int j;
			for (j = i - 1; j >= 0; j--) {
				if (employees.get(j).getSalary() < temp.getSalary()) {
					break;
				}
				employees.set(j + 1, employees.get(j));

			}

			employees.set(j + 1, temp);

		}
		System.out.println(employees);

	}

	public void sortByGender() {

		for (int i = 1; i < employees.size(); i++) {
			Employee temp = employees.get(i);

			int j;
			for (j = i - 1; j >= 0; j--) {
				if (!employees.get(j).isGender()) {
					break;
				}
				employees.set(j + 1, employees.get(j));

			}

			employees.set(j + 1, temp);

		}
		System.out.println(employees);

	}

	public boolean areEmployeesSortedByID() {
		for (int j = 0; j < employees.size()-1; j++) {
			if (employees.get(j).getID() > employees.get(j + 1).getID()) {
				return false;
			}
		}
		return true;

	}
	
	public void getEmployee(int id){
		
		 int low = 0;
        int high = employees.size() - 1;
         
        while(high >= low) {
            int middle = (low + high) / 2;
            if(employees.get(middle).getID() == id) {
                System.out.println(employees.get(middle));
                break;
            }
            if(employees.get(middle).getID() < id) {
                low = middle + 1;
            }
            if(employees.get(middle).getID() > id) {
                high = middle - 1;
            }
       }
        
        System.out.println("There is not employee with that ID number");
       
		
	}

}
