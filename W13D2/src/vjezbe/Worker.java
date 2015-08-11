package vjezbe;

public class Worker {

	private static String ID;
	private String name;
	private String salary;
	

	public Worker(String iD, String name, String salary) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
	}

	
	public static String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String toString(){
		return ID+" "+name+" "+salary;
	}
	
}
