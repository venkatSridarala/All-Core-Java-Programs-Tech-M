package Collections;

public class MusicMain {
	 public static void main(String[] args) { 
	  // TODO Auto-generated method stub 
	  MusicLibrary ml=new MusicLibrary(); 
	   
	  ml.addSong(new Song("Without Me","Eminem")); 
	  ml.addSong(new Song("Night Changes","One Direction")); 
	  ml.addSong(new Song("Steal My Girl","One Direction")); 
	   
	  ml.displayLibrary(); 
	   
	  ml.removeSong("Without Me"); 
	   
	  ml.playRandomSong(); 
	  ml.playRandomSong(); 
	  ml.playRandomSong(); 
	 } 
	 
	}