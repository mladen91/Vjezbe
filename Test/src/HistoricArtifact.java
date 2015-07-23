

/**
 * This class extends Exponat class, and it contains origin, and period when it is created.
 * It is used for creating Historic Artifact
 * @author mladen.teofilovic
 *
 */
public class HistoricArtifact extends Exponat {

	private String origin;
	private Period period;
	
	/**
	 * This constructor is used for creating historic artifact
	* @param iD - represents exhibit id (inherited from Exponat)
	 * @param name - represents exhibit name (inherited from Exponat)
	 * @param description - represents exhibit description (inherited from Exponat)
	 * @param origin - art origin
	 * @param period - period when it is created
	 */
	public HistoricArtifact(String iD, String name, String description,
			String origin, Period period) {
		super(iD, name, description);
		this.origin = origin;
		this.period = period;
	}

	@Override
	public String toString() {

		return "\n"+"Origin: "+origin+" Period: "+period;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		HistoricArtifact other = (HistoricArtifact) obj;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (period != other.period)
			return false;
		return true;
	};
	
	
}
