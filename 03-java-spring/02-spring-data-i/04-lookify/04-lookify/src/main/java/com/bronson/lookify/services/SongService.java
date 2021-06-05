package com.bronson.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bronson.lookify.models.Song;
import com.bronson.lookify.repositories.SongRepository;

@Service
public class SongService {
	private final SongRepository sRepo;
	public SongService (SongRepository repo) {
		this.sRepo = repo;
	}

	//get all table data
	public List<Song> getAll(){
		return this.sRepo.findAll();
	}
	
	//get your Top Ten
	public List<Song> topTenByRating() {
		return sRepo.findTop10ByOrderByRatingDesc();
	}
	
	//search Artists
	public List<Song> songsContainingArtist(String artist) {
		return sRepo.findByArtistContaining(artist);
	}
	
	//get one entry by id
	public Song getById(Long id){
		return this.sRepo.findById(id).orElse(null);
	}
	
	//create a new entry
	public Song createNew(Song newSong) {
		return this.sRepo.save(newSong);
	}
	
	//create a new entry manual way
	public Song createManually(String title, String artist, Integer rating) {
		Song newSong = new Song(title, artist, rating);
		return this.sRepo.save(newSong);
	}
	
	//delete an entry
	public void deleteById(Long id) {
		this.sRepo.deleteById(id);
	}
}
