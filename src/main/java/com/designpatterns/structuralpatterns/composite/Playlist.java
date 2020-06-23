package com.designpatterns.structuralpatterns.composite;

import java.util.ArrayList;

public class Playlist implements Playable {

	public String playlistName;
	public ArrayList<Playable> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	
	@Override
	public void play() {
		for (Playable playable : this.playlist) {
			playable.play();
		}
	}

	@Override
	public String getName() {
		return playlistName;
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		for (Playable playable : this.playlist) {
			playable.setPlaybackSpeed(speed);
		}
	}
	
	public void add(Playable playable) {
		this.playlist.add(playable);
	}
	
	public void remove(Playable playable) {
		this.playlist.remove(playable);
	}
}
