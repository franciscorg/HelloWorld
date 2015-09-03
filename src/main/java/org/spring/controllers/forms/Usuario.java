package org.spring.controllers.forms;

public class Usuario {

	private String name;
	
	private String password;
	
	public Usuario() {
		this.name = "";
		this.password = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [" + (name != null ? "name=" + name + ", " : "")
				+ (password != null ? "password=" + password : "") + "]";
	}
	
}
