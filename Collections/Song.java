package Collections;

public class Song {
	private String title,artist;
	public Song(String title, String artist) {
	this.title = title;
	this.artist = artist;
	}
	public String getTitle() {
	return title;
	}
	public void setTitle(String title) {
	this.title = title;
	}
	public String getArtist() {
	return artist;
	}
	public void setArtist(String artist) {
	this.artist = artist;
	}
	public void play() {
	System.out.println("Now Playing : "+title + "\t by :"+artist);
	}
	@Override
	public String toString() {
	return "Song [title=" + title + ", artist=" + artist + "]";
	}
}
