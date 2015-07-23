import java.util.ArrayList;
import java.util.Comparator;

/**
 * This class is used for creating a museum. It implements our Searchable
 * interface. It contains four lists (Exponat, Employee, HistoricArtifact,
 * ArtWork)
 * 
 * @author mladen.teofilovic
 *
 */
public class Museum implements Searchable {

	protected ArrayList<Exponat> exponats;
	private ArrayList<Employee> employees;
	private ArrayList<HistoricArtifact> artifacts;
	private ArrayList<ArtWork> artWorks;

	/**
	 * This constructor is used for creating a museum
	 * 
	 * @param exponats
	 *            - list of exhibits
	 * @param employees
	 *            - list of employees
	 * @param artifacts
	 *            - list of artifacts
	 * @param artWorks
	 *            - list of art work
	 */
	public Museum(ArrayList<Exponat> exponats, ArrayList<Employee> employees,
			ArrayList<HistoricArtifact> artifacts, ArrayList<ArtWork> artWorks) {
		super();
		this.exponats = exponats;
		this.employees = employees;
		this.artifacts = artifacts;
		this.artWorks = artWorks;
	}

	/**
	 * Method that will sort our exponates list
	 * 
	 * @param e
	 *            - list of exhibits
	 */
	public static void sort(ArrayList<Exponat> e) {

		e.sort(new Comparator<Exponat>() {

			@Override
			public int compare(Exponat e1, Exponat e2) {
				return e1.getName().compareTo(e2.getName());
			}

		});
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Museum other = (Museum) obj;
		if (artWorks == null) {
			if (other.artWorks != null)
				return false;
		} else if (!artWorks.equals(other.artWorks))
			return false;
		if (artifacts == null) {
			if (other.artifacts != null)
				return false;
		} else if (!artifacts.equals(other.artifacts))
			return false;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		if (exponats == null) {
			if (other.exponats != null)
				return false;
		} else if (!exponats.equals(other.exponats))
			return false;
		return true;
	}

	public String toString() {
		return employees + " \n" + artifacts + " \n" + exponats + " \n"
				+ artWorks;
	}

	/**
	 * Method that will try to find inserted string from our list attributes
	 */
	@Override
	public boolean fitsSearch(String s) {

		for (int i = 0; i < exponats.size(); i++) {

			//If it finds word into some of exhibits attributes words it will return true
			if (exponats.get(i).getID().indexOf(s) != -1
					|| exponats.get(i).getDescription().indexOf(s) != -1
					|| exponats.get(i).getName().indexOf(s) != -1) {
				return true;
			}
		}
        //If it finds some of employees attributes words it will return true
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getName().indexOf(s) != -1
					|| employees.get(i).getSurname().indexOf(s) != -1
					|| employees.get(i).getAge().indexOf(s) != -1) {
				return true;
			}		
		}
		return false;
	}

}
