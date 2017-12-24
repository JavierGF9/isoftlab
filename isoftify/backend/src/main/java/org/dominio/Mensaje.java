package org.dominio;

import org.persistencia.GestorMensajes;

public class Mensaje {
	CuentaUsuario receptor;
	CuentaUsuario emisor;
	String contenido;
	
	public Mensaje() {}
	
	public Mensaje(CuentaUsuario receptor, CuentaUsuario emisor, String contenido) {
		this.receptor=receptor;
		this.emisor=emisor;
		this.contenido=contenido;
	}
	
	public CuentaUsuario getEmisor() {
		return emisor;
	}
	public String getContenido() {
		return contenido;
	}
	
	public String leerContenido() {
		return contenido;
	}
	
	public CuentaUsuario getReceptor() {
		return receptor;
	} 
	
	public void leerMensaje() {
		Mensaje m = new Mensaje(receptor,emisor,contenido);
		String mensaje=GestorMensajes.getGestor().leerMensaje(m);
		System.out.println(mensaje);
	}
	
	public int enviarMensaje() {
		return GestorMensajes.getGestor().enviarMensaje(receptor,contenido);
	}
	
}
