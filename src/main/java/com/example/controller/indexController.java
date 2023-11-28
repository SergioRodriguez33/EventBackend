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
	public String index(Model model) {
		model.addAttribute("userForm", new User());
		return "index";
	}
	
	@PostMapping ("/register")
	public String registerUser(@ModelAttribute User user, Model model) {
		model.addAttribute("userForm", new User());
		System.out.println(user.toString());
		return "index";
	}
}
