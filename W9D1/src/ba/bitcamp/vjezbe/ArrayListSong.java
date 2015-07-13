package ba.bitcamp.vjezbe;

import java.util.Arrays;

public class ArrayListSong {

	private Song[] songs;

	public ArrayListSong() {
		songs = new Song[0];
	}

	public ArrayListSong(Song[] songs) {
		Song[] newSongArray = new Song[songs.length];
		for (int i = 0; i < newSongArray.length; i++) {
			newSongArray[i] = songs[i];
		}

	}

	public void addSong(Song s) {

		int counter = 0;

		for (int i = 0; i < songs.length; i++) {
			if (songs[i] == null) {
				counter++;
			}
		}
		if (counter == 0) {
			Song[] temp = new Song[songs.length * 2];
			for (int i = 0; i < songs.length; i++) {
				temp[i] = songs[i];
			}
			songs = temp;
		} else {

			for (int i = 0; i < songs.length; i++) {
				if (songs[i] == null) {
					songs[i] = s;
					break;
				}

			}

		}
	}

	public Song getSong(int idx) {
		return songs[idx];
	}

	public void removeSong(int idx) {

		Song[] removeSongArray = new Song[songs.length - 1];
		for (int i = 0; i < idx; i++) {
			removeSongArray[i] = songs[i];
		}

		for (int i = idx + 1; i < songs.length; i++) {

			removeSongArray[i - 1] = songs[i];

		}
		songs = removeSongArray;
	}

	public void removeSong(Song s) {
		for (int i = 0; i < songs.length; i++) {
			if (songs[i].equals(s)) {
				removeSong(i);
			}
		}
	}

	public int getSize() {
		return songs.length;
	}

	public int indexOf(Song s) {
		for (int i = 0; i < songs.length; i++) {
			if (songs[i].equals(s)) {
				return i;
			}
		}
		return -1;
	}

	public String toString() {
		return "ArrayListSong [songs=" + Arrays.toString(songs) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrayListSong other = (ArrayListSong) obj;
		if (!Arrays.equals(songs, other.songs))
			return false;
		return true;
	}

}
