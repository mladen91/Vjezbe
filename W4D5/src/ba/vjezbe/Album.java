package ba.vjezbe;

public class Album {

	public String nameAlbum;
	public Singer artistName;
	public Song[] artistSongs;
	public String genreAlbum;
	
	public Album(String nameAlbum, Singer artistName, Song[] artistSongs,
			String genreAlbum) {		
		this.nameAlbum = nameAlbum;
		this.artistName = artistName;
		this.artistSongs = artistSongs;
		this.genreAlbum = genreAlbum;
	}
	
	
	
}
