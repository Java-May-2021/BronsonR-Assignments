package com.bronson.date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index () {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model viewModel) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		viewModel.addAttribute("date", formatter.format(Calendar.getInstance().getTime()));
		return "Date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model viewModel) {
		 SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		 viewModel.addAttribute("time", formatter.format(Calendar.getInstance().getTime()));
		return "Time.jsp";
	}
}
