package org.spring.controllers.converters;

import java.util.List;
import java.util.Map;

public class Anidado {
	
	private Integer numero;
	
	private List<Anidado> lista;
	
	private Map<String, Anidado> mapa;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public List<Anidado> getLista() {
		return lista;
	}

	public void setLista(List<Anidado> lista) {
		this.lista = lista;
	}

	public Map<String, Anidado> getMapa() {
		return mapa;
	}

	public void setMapa(Map<String, Anidado> mapa) {
		this.mapa = mapa;
	}

	@Override
	public String toString() {
		return "Anidado [" + (numero != null ? "numero=" + numero + ", " : "")
				+ (lista != null ? "lista=" + lista + ", " : "") + (mapa != null ? "mapa=" + mapa : "") + "]";
	}

}
