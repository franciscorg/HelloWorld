package org.spring.controllers.converters.mensajes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/conversor-mensajes/*")
@Controller
public class ConversorMensajesController {
	
	// REQUEST URI:
	// http://localhost:8080/ejemploSpringMVC/conversor-mensajes/xml
	@RequestMapping(value="/xml", method=RequestMethod.GET)
	public @ResponseBody JavaBean xml() {
		return new JavaBean("Manzanas", "Renault");
	}
	
	// REQUEST URI:
	// http://localhost:8080/ejemploSpringMVC/conversor-mensajes/json
	@RequestMapping(value="/json", method=RequestMethod.GET)
	public @ResponseBody JavaBean json() {
		return new JavaBean("Peras", "Ferrary");
	}

}
