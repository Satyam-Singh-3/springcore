package com.spring.securty.ldap.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class ApplicationController {
 
	@RequestMapping("/rest")
	public String secure() {
		return"secure rest endpoint";
	}
}
