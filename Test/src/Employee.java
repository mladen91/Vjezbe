
/**
 * Class that is used for creating employee for museum
 * @author mladen.teofilovic
 *
 */
public class Employee  {

	private String name;
	private String surname;
	private Integer age;
	
	/**
	 * This constructor is used for creating employee from museum
	 * @param name - employee name
	 * @param surname - employee surname
	 * @param age - employee age
	 */
	public Employee(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
    /**
     * Getting employee name
     * @return
     */
	public String getName() {
		return name;
	}
    /**
     * Getting employee surname
     * @return
     */
	public String getSurname() {
		return surname;
	}
    /**
     * Getting employee age
     * @return
     */
	public String getAge() {
		return age.toString();
	}

	@Override
	public String toString() {
		
		return "\n"+"Name: "+name+" Surname: "+surname+" Age: "+age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

}
