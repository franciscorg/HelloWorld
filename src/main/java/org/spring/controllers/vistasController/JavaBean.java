package org.spring.controllers.vistasController;

public class JavaBean {
	
	private String mensaje1;
	private String mensaje2;
	
	public String getMensaje1() {
		return mensaje1;
	}
	public void setMensaje1(String mensaje1) {
		this.mensaje1 = mensaje1;
	}
	public String getMensaje2() {
		return mensaje2;
	}
	public void setMensaje2(String mensaje2) {
		this.mensaje2 = mensaje2;
	}
	
	@Override
	public String toString() {
		return "JavaBean [" + (mensaje1 != null ? "mensaje1=" + mensaje1 + ", " : "")
				+ (mensaje2 != null ? "mensaje2=" + mensaje2 : "") + "]";
	}
	
}
