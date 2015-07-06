package ba.bitcamp.vjezbe;

public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date(){
		this.day=1;
		this.month=1;
		this.year = 2000;
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString(){
		return day+":"+month+":"+year;
	}
	
	
}
