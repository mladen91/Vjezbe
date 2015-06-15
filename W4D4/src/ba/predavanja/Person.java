package ba.predavanja;

public class Person {

	public String name;
	public String lName;
	public Integer yearOfBirth;
	public String Adress;
	public String personID;
	public String email;
	public Integer heigth;
	public boolean isValid;
	public String favFood;
	public String favDrink;

	public Person(String name, String lName, Integer yearOfBirth,
			String adress, String personID, String email, Integer heigth,
			boolean isValid, String favFood, String favDrink) {
		super();
		this.name = name;
		this.lName = lName;
		this.yearOfBirth = yearOfBirth;
		Adress = adress;
		this.personID = personID;
		this.email = email;
		this.heigth = heigth;
		this.isValid = isValid;
		this.favFood = favFood;
		this.favDrink = favDrink;
	}

}
