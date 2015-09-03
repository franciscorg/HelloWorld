package org.spring.controllers.vistasController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/vistas/*")
public class VistasController {

	// REQUEST URL:
	// http://localhost:8080/ejemploSpringMVC/vistas/hola
	@RequestMapping("/hola")
	public ModelAndView modelAndView() {
		String mensaje1 = "usuario";
		String mensaje2 = "Otro mensaje";
		Map<String, String> modelo = new HashMap<>();
		modelo.put("mensaje1", mensaje1);
		modelo.put("mensaje2", mensaje2);
		// Forma antigua de devolver los jsp.
		// return new ModelAndView("/WEB-INF/jsp/hello.jsp","modelo",modelo);
		return new ModelAndView("hello", "modelo", modelo);
	}

	@RequestMapping("/saludos")
	public String vistaUno(Model modelo) {
		modelo.addAttribute("mensaje1", "Maria");
		modelo.addAttribute("mensaje2", "Nuevo mensaje");
		return "hello2";
	}

	// REQUEST URL:
	// http://localhost:8080/ejemploSpringMVC/vistas/saludosDos/juan/ferrari
	@RequestMapping("/saludosDos/{mensaje1}/{mensaje2}")
	public String vistaDos(@PathVariable String mensaje1, @PathVariable String mensaje2) {
		return "hello2";
	}

	// REQUEST URL:
	// http://localhost:8080/ejemploSpringMVC/vistas/saludosTres/juan/ferrari
	@RequestMapping("/saludosTres/{mensaje1}/{mensaje2}")
	public String vistaTres(JavaBean javaBean) {
		return "hello3";
	}
	
	// REQUEST URL:
	// http://localhost:8080/ejemploSpringMVC/vistas/vistaCuatro
	@RequestMapping("/vistaCuatro")
	public void vistaCuatro() {

	}
	
	// REQUEST URL:
	// http://localhost:8080/ejemploSpringMVC/vistas/vistaCinco
	@RequestMapping("/vistaCinco")
	public String vistaCinco() {
		return "vistas/vistaCuatro";
	}

}
