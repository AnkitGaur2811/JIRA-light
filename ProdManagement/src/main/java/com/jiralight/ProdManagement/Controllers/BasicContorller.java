package com.jiralight.ProdManagement.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicContorller {
    
    @GetMapping("/")
	public String index() {
		return "index";
	}

    @GetMapping("/login")
	public String login() {
		return "Login";
	}
}
