package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.User;

@Controller
public class indexController {

	@GetMapping("/")
	public String addEvent(Model model) {
		model.addAttribute("userForm", new User());
		return "addEvent";
	}

	@GetMapping("/aboutUs")
	public String aboutUs(Model model) {
    	// Add model attributes if needed
    	return "aboutUs";
	}
	@GetMapping("/profile")
	public String profile(Model model) {
    	// Add model attributes if needed
    	return "profile";
	}
	@GetMapping("/login")
	public String login(Model model) {
    	// Add model attributes if needed
    	return "login";
	}
	@GetMapping("/index")
	public String index(Model model) {
    	// Add model attributes if needed
    	return "index";
	}
	
	@PostMapping ("/register")
	public String registerUser(@ModelAttribute User user, Model model) {
		model.addAttribute("userForm", new User());
		System.out.println(user.toString());
		return "createdListing";
	}
}
