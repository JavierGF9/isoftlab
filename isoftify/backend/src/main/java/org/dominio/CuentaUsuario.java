package org.dominio;

public class CuentaUsuario {
	String userName;
	String password;
	
	public String getUserName() {
		return userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void enviarMensaje(String receptor, String contenido) {
		
	}
	
	public String leerMensaje() {
		String contenido = null;
		return contenido;
	}
}
