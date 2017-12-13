package org.dominio;

public class Producto {
	private String titulo;
	private String artista;
	private String año;
	private double precio;
	private int id;
	
	public Producto(String titulo, String artista, String año, double precio, int id) {
		this.titulo = titulo;
		this.artista = artista;
		this.año = año;
		this.precio = precio;
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
