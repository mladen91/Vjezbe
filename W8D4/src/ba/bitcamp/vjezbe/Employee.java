package ba.bitcamp.vjezbe;

public class Employee {

	private int ID;
	private String name;
	private String lastName;
	private boolean gender;
	private int salary;
	private Date date;
	private static int counter = 1000;

	public Employee() {
		super();
	}

	public Employee(int salary, String name, String lastName, boolean gender,
			int day, int month, int year) {
		super();
		this.ID = counter++;
		this.salary = salary;
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.date = new Date(day, month, year);
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public boolean isGender() {
		return gender;
	}

	public int getSalary() {
		return salary;
	}

	public Date getDate() {
		return date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		if (gender) {
			return ID + "\nName = " + name + " \nLast Name = " + lastName
					+ " \nGender = male" + "\n Salary = " + salary + " \n "
					+ date;
		} else {
			return ID + "\nName = " + name + " \nLast Name = " + lastName
					+ " \nGender = female" + "\n Salary = " + salary + " \n "
					+ date;
		}

	}

	public class Date {
		private int day;
		private int month;
		private int year;

		public Date(int day, int month, int year) {
			super();
			this.day = day;
			this.month = month;
			this.year = year;
		}

		public int getDay() {
			return day;
		}

		public int getMonth() {
			return month;
		}

		public int getYear() {
			return year;
		}

		@Override
		public String toString() {
			return "Date [day=" + day + ", month=" + month + ", year=" + year
					+ "]";
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Date other = (Date) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (day != other.day)
				return false;
			if (month != other.month)
				return false;
			if (year != other.year)
				return false;
			return true;
		}

		private Employee getOuterType() {
			return Employee.this;
		}

	}
}
