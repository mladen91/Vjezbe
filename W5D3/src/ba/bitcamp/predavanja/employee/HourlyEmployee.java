package ba.bitcamp.predavanja.employee;

public class HourlyEmployee extends Employee {

	private int hourlyRate;
	
	public HourlyEmployee(String name, String gender, int hourlyRate){
		super(name, gender);
		this.hourlyRate=hourlyRate;
	}
}
