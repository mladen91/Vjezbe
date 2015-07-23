

/**
 * This class extends Exponat class, and it contains author name, and period. 
 * It is used for creating ArtWork that is part of museum/
 * @author mladen.teofilovic
 *
 */
public class ArtWork extends Exponat{

	private String authorName;
	private Period period;

	/**
	 * Constructor that is used for creating art work 
	 * @param iD - represents exhibit id (inherited from Exponat)
	 * @param name - represents exhibit name (inherited from Exponat)
	 * @param description - represents exhibit description (inherited from Exponat)
	 * @param authorName - represents author name
	 * @param period - represents period when it is created
	 */
	public ArtWork(String iD, String name, String description, String authorName,
			Period period) {
		super(iD, name, description);
		this.authorName = authorName;
		this.period = period;
	}
	
	@Override
	public String toString() {
	
		return "\n"+"Author Name: "+authorName+" Period: "+period;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArtWork other = (ArtWork) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (period != other.period)
			return false;
		return true;
	};
	
	
	
}
