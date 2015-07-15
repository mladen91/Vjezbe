package vjezbe;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		

		Planet p1 = new Planet("Mercury", 500000, 50000000, 2);
		Planet p2 = new Planet("Venera", 50000, 5000000, 1);
		Planet p3 = new Planet("Earth", 5000, 500000, 0);
		Planet p4 = new Planet("Mars", 500, 50000, 1);
		
	
        ArrayList<Planet> planetList = new ArrayList<Planet>();
        planetList.add(p1);
        planetList.add(p2);
        planetList.add(p3);
        planetList.add(p4);
	
		
	
		
		Planet.sortByName(planetList);
		
		System.out.println(planetList);
		//kad kliknem na button ova komanda
		try {
			Desktop.getDesktop().browse(new URI("http://klix.ba"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
