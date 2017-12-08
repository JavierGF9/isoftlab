package org.RF3;

public class Album {
	private Cancion[] canciones;
	private String nombre_album;
	private String autor;
	private float duracion;
	private float precio;
	private String id_album;
	private String año;
	
	public Album() {
		
	}

	public Cancion[] getCanciones() {
		return canciones;
	}

	public void setCanciones(Cancion[] canciones) {
		this.canciones = canciones;
	}

	public String getNombre_album() {
		return nombre_album;
	}

	public void setNombre_album(String nombre_album) {
		this.nombre_album = nombre_album;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public float getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getId_album() {
		return id_album;
	}

	public void setId_album(String id_album) {
		this.id_album = id_album;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}
	
}
