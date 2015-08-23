package org.spring.controllers.converters;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

public class JavaBean {

	private Integer numero;
	
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date fecha;
	
	private Collection<Integer> collection;
	
	private List<Integer> lista;
	
	private Map<Integer, String> mapa;
	
	private Anidado anidado;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Collection<Integer> getCollection() {
		return collection;
	}

	public void setCollection(Collection<Integer> collection) {
		this.collection = collection;
	}

	public List<Integer> getLista() {
		return lista;
	}

	public void setLista(List<Integer> lista) {
		this.lista = lista;
	}

	public Map<Integer, String> getMapa() {
		return mapa;
	}

	public void setMapa(Map<Integer, String> mapa) {
		this.mapa = mapa;
	}  

	public Anidado getAnidado() {
		return anidado;
	}

	public void setAnidado(Anidado anidado) {
		this.anidado = anidado;
	}

	@Override
	public String toString() {
		return "JavaBean [" + (numero != null ? "numero=" + numero + ", " : "")
				+ (fecha != null ? "fecha=" + fecha + ", " : "")
				+ (collection != null ? "collection=" + collection + ", " : "")
				+ (lista != null ? "lista=" + lista + ", " : "") + (mapa != null ? "mapa=" + mapa + ", " : "")
				+ (anidado != null ? "anidado=" + anidado : "") + "]";
	}	
	
}
