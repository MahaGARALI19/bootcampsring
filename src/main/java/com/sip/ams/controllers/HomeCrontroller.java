package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCrontroller {
	
	@RequestMapping("/info")
	public String info(Model model) {
		String formation = "FullSlack";
		model.addAttribute("workshop", formation);
		return "home/info";
	}
	
	@RequestMapping("/affichage")
	public String affiche() {
		return "home/affichage";
	}

}
