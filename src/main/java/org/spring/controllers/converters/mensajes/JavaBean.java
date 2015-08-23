package org.spring.controllers.converters.mensajes;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JavaBean {
	
	private String fruta;

	private String coche;
	
	public JavaBean() { }

	public JavaBean(String fruta, String coche) {
		this.fruta = fruta;
		this.coche = coche;
	}

	public String getFruta() {
		return fruta;
	}

	public void setFruta(String fruta) {
		this.fruta = fruta;
	}

	public String getCoche() {
		return coche;
	}

	public void setCoche(String coche) {
		this.coche = coche;
	}

	@Override
	public String toString() {
		return "JavaBean [" + (fruta != null ? "fruta=" + fruta + ", " : "") + (coche != null ? "coche=" + coche : "")
				+ "]";
	}
	
}
