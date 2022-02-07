package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Component;
import com.example.demo.service.ComponentService;


@RestController
public class ComponentController {
	@Autowired
	private ComponentService componentservice;
	
	@PostMapping("/component")
	public String addcomponent(@RequestBody Component component) {
		componentservice.addcomponent(component);
		return "component added";
	}
	

}
