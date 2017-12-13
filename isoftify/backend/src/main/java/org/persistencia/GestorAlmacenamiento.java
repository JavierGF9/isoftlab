package org.persistencia;

import org.dominio.Cancion;

public class GestorAlmacenamiento {
	private static GestorAlmacenamiento instancia = null;

	protected GestorAlmacenamiento() {}

	public static GestorAlmacenamiento getGestor() {
		if (instancia == null) {
			instancia = new GestorAlmacenamiento();
		}
		return instancia;
	}
	
	// Guarda la canción en la BBDD
	public int guardarArchivo(Cancion c) {
		return 0;
	}
	
	public int actualizarCancion(Cancion c) {
		return 0;
	}
}
