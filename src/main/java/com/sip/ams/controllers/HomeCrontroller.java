package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeCrontroller {
	
	@PostMapping("/result")
	@ResponseBody
	public String resultat(@RequestParam("nom") String n, @RequestParam("email") String e) {
		return "Vous avez taper : " + n+ " un email : " + e;
	}
	
	@RequestMapping("/info")
	public String info(Model model) {
		String formation = "FullSlack";
		model.addAttribute("workshop", formation);
		ArrayList<String> names= new ArrayList<>();
		names.add("OCA");
		names.add("OCP");
		names.add("Spring");
		model.addAttribute("names", names);
		return "home/info";
	}
	
	@RequestMapping("/affichage")
	public String affiche() {
		return "home/affichage";
	}

}
