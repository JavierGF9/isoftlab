package org.persistencia;

import org.dominio.CuentaUsuario;
import org.dominio.Mensaje;

public class GestorMensajes {
	Mensaje[] mensajes;
	CuentaUsuario receptor;
	String contenido;
	
	public void enviarMensaje(CuentaUsuario receptor, String contenido) {
		
	}
	
	public void leerMensaje(Mensaje mensaje) {
		System.out.println(mensaje.getContenido());
	}
}
