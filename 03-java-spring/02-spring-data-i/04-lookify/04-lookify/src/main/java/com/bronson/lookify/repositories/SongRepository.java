package com.bronson.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bronson.lookify.models.Song;

public interface SongRepository extends CrudRepository<Song, Long>{
	List<Song> findAll();
	List<Song> findByArtistContaining(String artist);
	List<Song> findTop10ByOrderByRatingDesc();
}
