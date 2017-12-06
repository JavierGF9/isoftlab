package org.RF8;

public class Mensaje {
	CuentaUsuario receptor;
	CuentaUsuario emisor;
	String contenido;
	
	public CuentaUsuario getEmisor() {
		return emisor;
	}
	public String getContenido() {
		return contenido;
	}
	
	public String leerContenido() {
		return contenido;
	}
	
}
