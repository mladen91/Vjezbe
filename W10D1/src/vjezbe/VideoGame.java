package vjezbe;

public class VideoGame extends Application {

	private String genre;
	private String studio;
	private int numberOfCopies;

	public VideoGame(String name, int yearOfRelease, double version, int size,
			String genre, String studio, int numberOfCopies) {
		super(name, yearOfRelease, version, size);
		this.genre = genre;
		this.studio = studio;
		this.numberOfCopies = numberOfCopies;
	}
	
	@Override
	public String toString(){
		return "Genre: "+genre+" Studio: "+ " Number of copies: "+numberOfCopies; 
	}
	

}
