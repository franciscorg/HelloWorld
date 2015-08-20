package org.spring.controllers.peticiones;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/multiaccion/*")
public class MultiaccionController {

	@RequestMapping("/path")
	public @ResponseBody String simple () {
		return "Hola mundo !!";
	}
	
	@RequestMapping(value="/metodo", method=RequestMethod.GET)
	public @ResponseBody String simpleRevisado() {
		return "Hora revisado";
	}
		
	@RequestMapping(value="/parametro", method=RequestMethod.GET, params="param1")
	public @ResponseBody String peticionPorParametro() {
		return "Petición por presencia de parámetro";
	}
	
	@RequestMapping(value="/parametro", method=RequestMethod.GET, params="!param1")
	public @ResponseBody String peticionSinPresenciaDeParametro() {
		return "Petición por sin presencia de parámetro";
	}
	
	@RequestMapping(value="/cabeceras", method=RequestMethod.GET, headers="Accept=text/plain")
	public @ResponseBody String peticionPorCabecera() {
		return "Petición por cabeceras";
	}
	
	@RequestMapping(value="/produces", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String peticionPorPoduces() {
		return "Petición por produces application/json";
	}

	@RequestMapping(value="/*", method=RequestMethod.GET)
	public @ResponseBody String peticionPorExpresionRegular() {
		return "Petición por expresión regular";
	}

	
}
