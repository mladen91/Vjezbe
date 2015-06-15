package ba.vjezbe;

public class Song {

	public Singer musicArtist;
	public String songName;
	public Integer yearOfRelease;
	public String genre;
	
	public Song(Singer musicArtist, String songName, Integer yearOfRelease,
			String genre) {
		this.musicArtist = musicArtist;
		this.songName = songName;
		this.yearOfRelease = yearOfRelease;
		this.genre = genre;
	}
	
	
	
	
}
