package com.suramericana.diagnosticofinanciero.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suramericana.diagnosticofinanciero.service.diagnosticoService;

@RestController
public class mainController {
	
	@RequestMapping("/inicio")
	public String main(@RequestParam(value="name", defaultValue="") String name) {
		return  "OK";
	}

}
