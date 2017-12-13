package org.dominio;

public class Monedero {
	private double fondos = 0;
	private String id;
	
	public double getFondos() {
		return fondos;
	}
	public void setFondos(double fondos) {
		this.fondos = fondos;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
