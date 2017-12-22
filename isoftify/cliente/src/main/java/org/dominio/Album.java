package org.dominio;

import java.util.ArrayList;

import org.persistencia.GestorAlbumes;

public class Album {
	private String nombre_album;
	private String autor;
	private String duracion;
	private int id;
	private int año;
	
	public Album(String nombre_album, String autor, String duracion, int año) {
		this.nombre_album = nombre_album;
		this.autor = autor;
		this.duracion = duracion;
		this.año = año;
	}
	
	// Este constructor no debe ser usado por nosotros, ya que el id se establece automáticamente
	public Album(int id, String nombre_album, String autor, String duracion, int año) {
		this.id = id;
		this.nombre_album = nombre_album;
		this.autor = autor;
		this.duracion = duracion;
		this.año = año;
	}


	public Cancion[] getCanciones() {
		return GestorAlbumes.getGestor().getCanciones(id);
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

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public float getPrecio() {
		if (id < 1) return 0;
		return GestorAlbumes.getGestor().conseguirPrecioTotal(id);
	}

	public int getId() {
		return id;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	public int guardarAlbum() {
		return GestorAlbumes.getGestor().guardarAlbum(this); 
	}
	
	public String toString() {
		return String.format("[%d] %s, %s (%d) [%s minutos, %.2f €]", id, nombre_album, autor, año, duracion, getPrecio());
	}

	public static ArrayList<Album> conseguirTodosAlbumes() {
		return GestorAlbumes.getGestor().conseguirTodosAlbumes();
	}
	
	public static Album buscarAlbumPorTitulo(String titulo) {
		return GestorAlbumes.getGestor().buscarAlbumPorTitulo(titulo);
	}

	public int borrarAlbum() {
		return GestorAlbumes.getGestor().borrarAlbum(id);
	}
}
