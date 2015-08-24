package org.spring.controllers.converters.mensajes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.syndication.feed.atom.Feed;
import com.sun.syndication.feed.rss.Channel;

@RequestMapping("/conversormensajes/*")
@Controller
public class ConversorMensajesController {

	// REQUEST URI:
	// http://localhost:8080/ejemploSpringMVC/conversor-mensajes/xml
	@RequestMapping(value = "/xml", method = RequestMethod.GET)
	public @ResponseBody JavaBean xml() {
		return new JavaBean("Manzanas", "Renault");
	}

	// REQUEST URI:
	// http://localhost:8080/ejemploSpringMVC/conversor-mensajes/json
	@RequestMapping(value = "/json", method = RequestMethod.GET)
	public @ResponseBody JavaBean json() {
		return new JavaBean("Peras", "Ferrary");
	}

	// REQUEST URI:
	// http://localhost:8080/ejemploSpringMVC/conversor-mensajes/atom
	@RequestMapping(value = "/atom", method = RequestMethod.GET)
	public @ResponseBody Feed atom() {
		Feed feed = new Feed();
		feed.setFeedType("atom_1.0");
		feed.setTitle("Titulo de prueba atom");

		return feed;
	}

	// REQUEST URI:
	// http://localhost:8080/ejemploSpringMVC/conversor-mensajes/rss
	@RequestMapping(value = "/rss", method = RequestMethod.GET)
	public @ResponseBody Channel rss() {
		Channel channel = new Channel();
		channel.setFeedType("rss_2.0");
		channel.setTitle("Titulo de prueba rss");
		channel.setDescription("Cuerpo de la descripción");
		channel.setLink("http://www.dicotraining.com");
		return channel;
	}

}
