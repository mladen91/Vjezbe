import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Creating historic artifacts
		HistoricArtifact art1 = new HistoricArtifact("1", "Tyranosaurus",
				"Dinosaur that eats everything", "Somewhere", Period.PRAHISTORY);
		HistoricArtifact art2 = new HistoricArtifact("2", "Pterodactilus",
				"Dynasour that flies", "Somewhere", Period.PRAHISTORY);
		HistoricArtifact art3 = new HistoricArtifact("3",
				"Triceratops horridus", "Dynosaur aggresive type", "Somewhere",
				Period.PRAHISTORY);
		HistoricArtifact art4 = new HistoricArtifact("4", "Sauropod",
				"Dynosaur herbic type", "Somewhere", Period.PRAHISTORY);
		// Creating and filling list of artifacts
		ArrayList<HistoricArtifact> artifacts = new ArrayList<HistoricArtifact>();
		artifacts.add(art1);
		artifacts.add(art2);
		artifacts.add(art3);
		artifacts.add(art4);
		// Creating art works
		ArtWork artWork1 = new ArtWork("1", "Monalisa", "Picture", "Leonardo",
				Period.MODERNART);
		ArtWork artWork2 = new ArtWork("2", "The Starry Night", "Picture",
				"Vincent van Gogh", Period.MODERNART);
		ArtWork artWork3 = new ArtWork("3", "Daubigny's Garden", "Picture",
				"Vincent van Gogh", Period.MODERNART);
		ArtWork artWork4 = new ArtWork("4", "David", "Sclupture",
				"Michelangelo", Period.MODERNART);
		// Creating list of art works
		ArrayList<ArtWork> artWorks = new ArrayList<ArtWork>();
		artWorks.add(artWork1);
		artWorks.add(artWork2);
		artWorks.add(artWork3);
		artWorks.add(artWork4);
		// Creating employees
		Employee emp1 = new Employee("Ajdin", "Brkic", 21);
		Employee emp2 = new Employee("Semir", "Sahman", 21);
		Employee emp3 = new Employee("Edvin", "Mulabdic", 25);
		Employee emp4 = new Employee("Nidal", "Salkic", 24);
		// Creating list of employees
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		// Creating exhibits
		Exponat exp1 = new Exponat(
				"1",
				"Kleobis and Biton",
				"kouroi of the Archaic period, c. 580 BC, held at the Delphi Archaeological Museum");

		Exponat exp2 = new Exponat("2", "Black-figure olpe", "wine vessel");
		Exponat exp3 = new Exponat("3", "The Moschophoros or calf-bearer",
				" 570 BC, Athens, Acropolis Museum");
		Exponat exp4 = new Exponat(
				"4",
				"Medal of John VIII Palaeologus",
				" c. 1435, by Pisanello, the first portrait medal, a medium essentially made for collecting.");
		// Creating array list of exhibits
		ArrayList<Exponat> exponats = new ArrayList<Exponat>();
		exponats.add(exp1);
		exponats.add(exp2);
		exponats.add(exp3);
		exponats.add(exp4);
		// Creating a museum
		Museum m = new Museum(exponats, employees, artifacts, artWorks);
		// Sorting exponates from museum
		Museum.sort(exponats);

		// Printing sorted exhibits
		System.out.println(exponats);

		// Searching word from museum
		System.out.println(m.fitsSearch("wine"));

		// Printing everything from museum
		System.out.println(m);

	}
}
