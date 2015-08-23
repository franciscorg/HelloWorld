package org.spring.controllers.converters;

import java.util.Collection;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/conversor/*")
public class ConversorDatosController {
	
	
	@RequestMapping("/entero")
	public @ResponseBody String entero (@RequestParam Integer numero) {
		return "Dato numérico convertido " + numero;
	}
	
	// REQUEST URI:
	// http://localhost:8080/ejemploSpringMVC/conversor/fecha?fecha=2010-12-05
	@RequestMapping("/fecha")
	public @ResponseBody String fecha (@RequestParam @DateTimeFormat(iso=ISO.DATE) Date fecha) {
		return "Dato fecha convertido " + fecha;
	}

	// REQUEST URI:
	// http://localhost:8080/ejemploSpringMVC/conversor/fecha2?fecha=01-02-2012
	@RequestMapping("/fecha2")
	public @ResponseBody String fecha2 (@RequestParam @DateTimeFormat(pattern="dd-MM-yyyy") Date fecha) {
		return "Dato fecha convertido " + fecha;
	}

	// REQUEST URI:
	// http://localhost:8080/ejemploSpringMVC/conversor/coleccion?coleccion=50,30,20,10
	// ó
	// http://localhost:8080/ejemploSpringMVC/conversor/coleccion?coleccion=50&coleccion=30
	@RequestMapping("/coleccion")
	public @ResponseBody String coleccion (@RequestParam Collection<Integer> coleccion) {
		return "Dato colección convertido " + coleccion;
	}
	
	// REQUEST URI:
	// http://localhost:8080/ejemploSpringMVC/conversor/coleccion?coleccion=01-02-2015,02-02-2015
	@RequestMapping("/fechas")
	public @ResponseBody String coleccionFechas (@RequestParam @DateTimeFormat(pattern="dd-MM-yyyy") Collection<Date> coleccion) {
		return "Dato colección fechas convertido " + coleccion;
	}
	
	// REQUEST URI:
	// http://localhost:8080/ejemploSpringMVC/conversor/objeto?numero=12&fecha=01-02-2012
	// http://localhost:8080/ejemploSpringMVC/conversor/objeto?numero=12&fecha=01-02-2012&collection=20,30,40
	// http://localhost:8080/ejemploSpringMVC/conversor/objeto?lista[0]=0&lista[1]=1
	// http://localhost:8080/ejemploSpringMVC/conversor/objeto?mapa[0]=david&mapa[1]=marta
	// http://localhost:8080/ejemploSpringMVC/conversor/objeto?anidado.numero=1
	// http://localhost:8080/ejemploSpringMVC/conversor/objeto?anidado.lista[0].numero=1&anidado.lista[1].numero=2
	// http://localhost:8080/ejemploSpringMVC/conversor/objeto?anidado.mapa[David].numero=1&anidado.mapa[Pepe].numero=2
	// http://localhost:8080/ejemploSpringMVC/conversor/objeto?anidado.mapa[David].lista[0].numero=1&anidado.mapa[Pepe].numero=2
	@RequestMapping("/objeto")
	public @ResponseBody String objeto (JavaBean bean) {
		return "Datos del JavaBean " + bean;
	}
	

}
