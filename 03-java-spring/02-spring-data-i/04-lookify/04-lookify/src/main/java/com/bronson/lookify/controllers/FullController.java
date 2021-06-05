package com.bronson.lookify.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bronson.lookify.models.Song;
import com.bronson.lookify.services.SongService;

@Controller
public class FullController {
	@Autowired
	private SongService sServ;
	public FullController (SongService service) {
		this.sServ = service;
	}
	
	@GetMapping("/")
	public String welcome() {
		return "welcome.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(@ModelAttribute("allSongs") Song song, Model viewModel) {
		viewModel.addAttribute("allSongs", this.sServ.getAll());
		return "dashboard.jsp";
	}
	
	@GetMapping("/search")
	public String Search(@RequestParam("artist") String artist, Model model) {
		model.addAttribute("allSongs",	this.sServ.songsContainingArtist(artist));
		model.addAttribute("artist", artist);
		return "searchResults.jsp";
	}
	
	@GetMapping("/search/topten")
	public String topTen(Model viewModel) {
		viewModel.addAttribute("allSongs", this.sServ.topTenByRating());
		return "topTen.jsp";
	}
	
	@GetMapping("/song/{id}")
	public String showSong(@PathVariable("id") Long id, Model viewModel) {
		Song viewSong = this.sServ.getById(id);
		viewModel.addAttribute("song", viewSong);
		return "showSong.jsp";
	}
	
	@GetMapping("/song/new")
	public String newSong(@ModelAttribute("song") Song song) {
		return "newEntry.jsp";
	}
	
	@PostMapping("/song/new")
	public String addNew(@Valid @ModelAttribute("song") Song song, BindingResult result ) {
		if (result.hasErrors()) {
			return "newEntry.jsp";
		}
		this.sServ.createNew(song);
		return "redirect:/dashboard";
	}
	
	@DeleteMapping("/delete/{id}") //remember...this must be a form button on the jsp to work properly with MySQL server info
	public String delete(@PathVariable("id") Long id) {
		this.sServ.deleteById(id);
		return "redirect:/dashboard";
	}
	
}
