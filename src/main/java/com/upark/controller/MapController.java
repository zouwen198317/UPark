package com.upark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController{
	
	 @GetMapping("/map")
	 public String getUser(Model model) {
	        model.addAttribute("name", "Dylan");
	        return "map";
	 }

}