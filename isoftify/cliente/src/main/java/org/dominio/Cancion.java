package org.dominio;

import java.util.ArrayList;

import org.persistencia.GestorCanciones;

public class Cancion {
	private String nombre_cancion;
	private int id;
	private float precio;
	private String duracion;
	private String autor;
	private Album album;
	private int anio;
	
	public Cancion() {}
	
	public Cancion(String nombre_cancion, String autor, Album album, int anio, String duracion, float precio) {
		this.nombre_cancion = nombre_cancion;
		this.precio = precio;
		this.duracion = duracion;
		this.autor = autor;
		this.album = album;
		this.anio = anio;
	}

	public Cancion(int id, String titulo, String autor, Album album, int anio, String duracion, float precio) {
		this.id = id;
		this.nombre_cancion = titulo;
		this.autor = autor;
		this.album = album;
		this.anio = anio;
		this.duracion = duracion;
		this.precio = precio;
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
	
	public int guardarCancion() {
		return GestorCanciones.getGestor().guardarCancion(this);
	}
	
	public String toString() { 
		return String.format("[%d] %s - %s, %s (%d) [%s minutos, %f euros]", id, nombre_cancion, autor, album.getNombre_album(), anio, duracion, precio);
	}
	
	public static ArrayList<Cancion> conseguirTodasCanciones() {
		return GestorCanciones.getGestor().conseguirTodasCanciones();
	}

	public static Cancion buscarCancionPorTitulo(String titulo) {
		return GestorCanciones.getGestor().buscarCancionPorTitulo(titulo);
	}

	public int borrarCancion() {
		return GestorCanciones.getGestor().borrarCancion(id);
	}
}
