package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequestMapping("/events")
public class EventController {

    private final UserService userService;

    @Autowired
    public EventController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String registerEvent(@ModelAttribute("userForm") User user) {
        userService.saveUser(user);
        return "index"; // Redirect to the index page after saving
    }
}

//redirect:/index.html
