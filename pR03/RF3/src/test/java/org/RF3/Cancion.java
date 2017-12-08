package org.RF3;

public class Cancion {
	private String nombre_cancion;
	private String id_cancion;
	private float precio;
	private float duracion;
	private String autor;
	private Album album;
	private String año;
	
	public Cancion() {
		
	}

	public String getNombre_cancion() {
		return nombre_cancion;
	}

	public void setNombre_cancion(String nombre_cancion) {
		this.nombre_cancion = nombre_cancion;
	}

	public String getId_cancion() {
		return id_cancion;
	}

	public void setId_cancion(String id_cancion) {
		this.id_cancion = id_cancion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}	
	
}
