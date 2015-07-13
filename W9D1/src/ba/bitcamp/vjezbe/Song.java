package ba.bitcamp.vjezbe;

public class Song {

	public static final int POP = 1;
	public static final int ROCK = 2;

	private String songName;
	private String authorName;
	private int yearOfRelease;
	private int genre;
	private Song nextSong;

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}
	
	

	public Song getNextSong() {
		return nextSong;
	}

	public void setNextSong(Song nextSong) {
		this.nextSong = nextSong;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (genre != other.genre)
			return false;
		if (songName == null) {
			if (other.songName != null)
				return false;
		} else if (!songName.equals(other.songName))
			return false;
		if (yearOfRelease != other.yearOfRelease)
			return false;
		return true;
	}

}
