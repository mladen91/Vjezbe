package ba.bitcamp.vjezbe;

public class MainTemperature {

	public static void main(String[] args) {
		
		//Creating temperature object
		Temperature t= new Temperature(25);
		//Getting temperature in Kelvin
		System.out.println(t.getTemperatureInC()+" C is: "+t.getTemperatureInK()+" Kelvin");
		//Setting new temperature value 
		t.setTemperature(30);
		//Getting temperature in Fahrenheit
		System.out.println(t.getTemperatureInC()+" C is: "+t.getTemperatureInF()+" Fahrenheit");
		

	}

}
