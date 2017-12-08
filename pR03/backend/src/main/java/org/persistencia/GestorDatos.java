package org.persistencia;

import org.dominio.*;
import com.opencsv.CSVReader;

public class GestorDatos {
	private static GestorDatos instancia = null;

	protected GestorDatos() {}

	public static GestorDatos getGestor() {
		if (instancia == null) {
			instancia = new GestorDatos();
		}
		return instancia;
	}
	
	// Guarda la canción en la BBDD
	public int guardarArchivo(Cancion c) {
		return 0;
	}
	
	public int actualizarArchivo(Cancion c) {
		return 0;
	}
	
	public Cancion[] buscarArtista(String busqueda) {
		return new Cancion[0];
	}
	
	public Cancion[] buscarTitulo(String busqueda) {
		return new Cancion[0];
	}
	
	public Cancion[] buscarAlbum(String busqueda) {
		return new Cancion[0];
	}
}
