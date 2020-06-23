package com.designpatterns.structuralpatterns.composite;

public class Song implements Playable {

	public String songName;
	public String artist;
	public float speed = 1; // Default playback speed

	public Song(String songName, String artist ) {
		this.songName = songName;
		this.artist = artist; 
	}

	
	@Override
	public void play() {
	}

	@Override
	public String getName() {
		return songName;
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		this.speed = speed;
	}


	public String getArtist() {
		return artist;
	}
	
	

}