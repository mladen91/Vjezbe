package ba.bitcamp.predavanja;

public class User {

	public static int userCount = 0;

	private String name;
	private String surname;
	private Integer age;
	private int id;

	public User(String name, String surname, Integer age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.id = ++userCount;
	}

	public User(String name, String surname) {
		this(name, surname, 0);

	}

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname() {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge() {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String toString() {
		String output = String.format("Name: %s, Surname: %s, Id: %d", name,
				surname, id);
		return output;

	}

	public boolean Equals(User other) {
		if (this.name.equals(other.name) && this.surname.equals(other.surname)
				&& this.age == other.age && this.id == other.id) {
			return true;
		} else {
			return false;
		}
	}

	public User(User other) {
		this( other.name,other.surname,other.age);
		userCount--;
		this.id=other.id;
	}
}
