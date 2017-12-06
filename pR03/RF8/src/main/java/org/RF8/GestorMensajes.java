package org.RF8;

public class GestorMensajes {
	Mensaje[] mensajes;
	CuentaUsuario receptor;
	String contenido;
	
	public void enviarMensaje(CuentaUsuario receptor, String contenido) {
		
	}
	
	public void leerMensaje(Mensaje mensaje) {
		System.out.println(mensaje.contenido);
	}
}
