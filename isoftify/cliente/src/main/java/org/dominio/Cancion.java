package org.dominio;

public class Cancion {
	private String nombre_cancion;
	private int id;
	private float precio;
	private String duracion;
	private String autor;
	private Album album;
	private int anio;
	
	public Cancion(String nombre_cancion, int id, float precio, String duracion, String autor, Album album,
			int anio) {
		super();
		this.nombre_cancion = nombre_cancion;
		this.id = id;
		this.precio = precio;
		this.duracion = duracion;
		this.autor = autor;
		this.album = album;
		this.anio = anio;
	}

	public String getNombre_cancion() {
		return nombre_cancion;
	}

	public void setNombre_cancion(String nombre_cancion) {
		this.nombre_cancion = nombre_cancion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
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

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
}
