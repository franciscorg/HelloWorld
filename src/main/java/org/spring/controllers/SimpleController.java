package org.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {
	
	@RequestMapping("/simple")
	public @ResponseBody String simple () {
		return "Hola mundo !!";
	}
	
	@RequestMapping(value="/simple/revisado", method=RequestMethod.GET)
	public @ResponseBody String simpleRevisado() {
		return "Hora revisado";
	}

}
