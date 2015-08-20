package org.spring.controllers.datos;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("datos/*")
public class DatosController {

	@RequestMapping(value = "/parametro", method = RequestMethod.GET)
	public @ResponseBody String conParametro(@RequestParam String param1) {
		return "Parámetro recuperado: " + param1;
	}

	@RequestMapping(value = "/pathvariable/{param1}", method = RequestMethod.GET)
	public @ResponseBody String conPathVariable(@PathVariable String param1) {
		return "Parámetro obtenido con path variable: " + param1;
	}

	// REQUEST URL:
	// http://localhost:8080/ejemploSpringMVC/datos/David;variableMatriz=otroDato/cualquiercosa
	@RequestMapping(value = "//{param1}/cualquiercosa", method = RequestMethod.GET)
	public @ResponseBody String conMatrixVariable(@PathVariable String param1, @MatrixVariable String variableMatriz) {
		return "Parámetro obtenido de la matriz=" + variableMatriz + " del segmento param1=" + param1;
	}

	// REQUEST URL:
	// http://localhost:8080/ejemploSpringMVC/datos/ruta1;variableMatriz=dato1/ruta2;variableMatriz=dato2
	@RequestMapping(value = "{param1}/{param2}", method = RequestMethod.GET)
	public @ResponseBody String withMatrixVariablesMultiple(@PathVariable String param1,
			@MatrixVariable(value = "variableMatriz", pathVar = "param1") String matriz1, @PathVariable String param2,
			@MatrixVariable(value = "variableMatriz", pathVar = "param2") String matriz2) {
		return "Obtenida variable variableMatriz=" + matriz1 + " desde la ruta '" + param1
				+ "' y la variable variableMatriz=" + matriz2 + " desde la ruta '" + param2 + "'";
	}

	// Con cabeceras.
	// REQUEST URL:
	// http://localhost:8080/ejemploSpringMVC/datos/cabeceras
	/**
	 * Muestra los tipos MIME que acepta la petición. Los tipos soportados
	 * dependen del navegador con el que hagamos la petición.
	 * 
	 * @param accept
	 * @return
	 */
	@RequestMapping(value = "/cabeceras", method = RequestMethod.GET)
	public @ResponseBody String conCabeceras(@RequestHeader String accept) {
		return "Valor obtenido de la cabecera " + accept;
	}

	// REQUEST URL:
	// http://localhost:8080/ejemploSpringMVC/datos/navegador
	@RequestMapping(value = "/navegador", method = RequestMethod.GET)
	public @ResponseBody String averiguarUserAgent(@RequestHeader(value = "User-Agent") String userAgent) {
		return "Valor obtenido de la cabecera " + userAgent;
	}

	// REQUEST URL:
	// http://localhost:8080/ejemploSpringMVC/datos/cookies
	@RequestMapping(value = "/cookies", method = RequestMethod.GET)
	public @ResponseBody String conCookies(@CookieValue String JSESSIONID) {
		return "Valor obtenido de la cookie=" + JSESSIONID;
	}

	// REQUEST URL:
	// http://localhost:8080/ejemploSpringMVC/index_body.jsp
	@RequestMapping(value = "/body", method = RequestMethod.POST)
	public @ResponseBody String conBody(@RequestBody String body) {
		return "Valor obtenido del body " + body;
	}

	// REQUEST URL:
	// http://localhost:8080/ejemploSpringMVC/index_entidad.jsp
	@RequestMapping(value = "/entidad", method = RequestMethod.POST)
	public @ResponseBody String conEntity(HttpEntity<String> entity) {
		return "Posted request body '" + entity.getBody() + "'; headers = " + entity.getHeaders();
	}

}
