package Collections;

import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {
	 List<Song> songs; 
	 
	 public MusicLibrary() { 
	  this.songs = new ArrayList<>(); 
	 } 
	  
	 public void addSong(Song song) { 
	  this.songs.add(song); 
	 } 
	  
	 public void removeSong(String name) { 
	  boolean songFound=false; 
	  for(Song song:songs) { 
	   if(song.getTitle().equals(name)) { 
	    System.out.println("Product"); 
	    songs.remove(song); 
	    songFound=true; 
	    break; 
	   } 
	  } 
	  if(!songFound) { 
	   System.out.println("There is not product found with name :"+name); 
	  } 
	 } 
	  
	 public void playRandomSong() { 
	  int index=(int) Math.floor(Math.random()*songs.size()); 
	  Song song=songs.get(index); 
	  song.play(); 
	 } 
	  
	 public void displayLibrary() { 
	  for(Song s:songs) { 
	   System.out.println(s); 
	  } 
	 } 
	} 