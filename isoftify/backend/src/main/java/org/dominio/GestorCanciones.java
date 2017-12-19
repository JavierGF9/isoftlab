package org.dominio;

import org.persistencia.*;

public class GestorCanciones {
	private static GestorCanciones instancia = null;
	
	protected GestorCanciones() {}
	
	public static GestorCanciones getGestor() {
		if (instancia == null) {
			instancia = new GestorCanciones();
		}
		
		return instancia;
	}
	
	public int guardarCancion(Cancion c) {
		if (GestorAlmacenamiento.getGestor().guardarArchivo(c) == 0)
			return GestorDatos.getGestor().guardarArchivo(c);
		
		return 1;
	}
	
	public int actualizarCancion(Cancion c) {
		return GestorDatos.getGestor().actualizarArchivo(c);
	}
	
	public Cancion[] buscarCanciones(int modo, String busqueda) {
		/* Modos:
		 * - 1: Album
		 * - 2: artista
		 * - 3: titulo
		 */
		
		switch (modo) {
		case 1:
			return GestorDatos.getGestor().buscarAlbum(busqueda);
		case 2:
			return GestorDatos.getGestor().buscarArtista(busqueda);
		case 3:
			return GestorDatos.getGestor().buscarTitulo(busqueda);
		}
		
		return null;
	}
}
