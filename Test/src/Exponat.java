

/**
 * This class implements Comparable, and Searchable interfaces, and it is used
 * for collecting exhibits that are part of museum.
 * 
 * @author mladen.teofilovic
 *
 */
public class Exponat implements Comparable<Exponat>{

	private String ID;
	private String name;
	private String description;

	/**
	 * This constructor is used for creating exhibit that is part of museum.
	 * 
	 * @param iD
	 *            - represents exhibit id
	 * @param name
	 *            - represents exhibit name
	 * @param description
	 *            - represents exhibit description
	 */
	public Exponat(String iD, String name, String description) {
		super();
		ID = iD;
		this.name = name;
		this.description = description;
	}

    /**
     * Getting exhibit name
     * @return - name
     */
	public String getName() {
		return name;
	}
	/**
	 * Method that will get ID for us
	 * @return - ID
	 */
	public String getID() {
		return ID;
	}

    /**
     * Getting exhibit description
     * @return
     */
	public String getDescription() {
		return description;
	}


	@Override
	public String toString() {

		return "\n"+"ID: "+ID+" Name: "+name+" Description: "+description;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exponat other = (Exponat) obj;
		if (ID != other.ID)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/**
	 * Method that is part of comparable interface
	 */
	@Override
	public int compareTo(Exponat o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
 

}
