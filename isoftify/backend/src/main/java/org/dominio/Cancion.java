package org.dominio;

public class Cancion {
	private String titulo;
	private String album;
	private float precio;
	private String archivo;
	
	public Cancion(String t, String a, float p, String path) {
		titulo = t;
		album = a;
		precio = p;
		archivo = path;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getArchivo() {
		return archivo;
	}

	public int guardarCancion() {
		return GestorCanciones.getGestor().guardarCancion(this);
	}
	
	public int actualizarCancion() {
		return GestorCanciones.getGestor().actualizarCancion(this);
	}
	
	public String toString() {
		return titulo + " " + album + " " + precio + " " + archivo;
	}
}
