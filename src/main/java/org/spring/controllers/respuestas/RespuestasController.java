package org.spring.controllers.respuestas;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/respuestas/*")
public class RespuestasController {

	@RequestMapping("/path")
	public @ResponseBody String respuestasConResponseBody() {
		return "respuesta con response body";
	}

	// REQUEST URL:
	// http://localhost:8080/ejemploSpringMVC/respuestas/entidad/estado
	@RequestMapping("/entidad/estado")
	public ResponseEntity<String> respuestaConResponseEntity() {
		return new ResponseEntity<>("No puedes pasar", HttpStatus.FORBIDDEN);
	}

	// REQUEST URL:
	// http://localhost:8080/ejemploSpringMVC/respuestas/entidad/completo
	@RequestMapping("/entidad/completo")
	public ResponseEntity<String> respuestaConResponseEntityCompleta() {
		HttpHeaders cabeceras = new HttpHeaders();
		cabeceras.setContentType(MediaType.TEXT_HTML);
		return new ResponseEntity<>("<h1>No puedes pasar</h1>", cabeceras, HttpStatus.FORBIDDEN);
	}

}
