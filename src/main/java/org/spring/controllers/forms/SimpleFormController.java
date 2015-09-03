package org.spring.controllers.forms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/simpleform")
public class SimpleFormController {

	@RequestMapping(method=RequestMethod.GET)
	public String loadForm(Model modelo) {
		modelo.addAttribute(new Usuario());
		return "simpleform";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String captureDataForm(@ModelAttribute Usuario usuario, Model modelo) {
		modelo.addAttribute(usuario);
		return "responseform";
	}
	
}
