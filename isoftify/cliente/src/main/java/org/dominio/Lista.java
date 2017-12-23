package org.dominio;

public class Lista {
	private int cancion; /*para simplificar el codigo, solo será posible añadir una cancion y un album por lista*/
	private int album;
	private String cuenta;
	private String nombre_lista;
	private int id;
	
	public Lista(String nombre_lista, String cuenta, int cancion, int album) {
		this.nombre_lista = nombre_lista;
		this.cuenta = cuenta;
		this.album = album;
		this.cancion=cancion;
	}
	
	// Este constructor no debe ser usado por nosotros, ya que el id se establece automÃ¡ticamente
	public Lista(int id,String nombre_lista, String cuenta, int cancion, int album) {
		this.id=id;
		this.nombre_lista = nombre_lista;
		this.cuenta = cuenta;
		this.album = album;
		this.cancion=cancion;
	}
	
	public void set_cancion(int id) { 
		this.cancion=id; 
	}
	
	public void set_album(int id) { 
		this.album=id;
	}
	
	public void borrar_cancion() {
		this.cancion=0;
	}
	
	public void borrar_album() {
		this.album=0;
	}
	
	public int getCancion() {
		return cancion;
	}
	
	public String getCuenta() {
		return cuenta;
	}

	public int getAlbum() {
		return album;
	}
	
	public String getNombre_lista() {
		return nombre_lista;
	}
	
	public void setNombre_lista(String nombre_lista) {
		this.nombre_lista = nombre_lista;
	}
	
	public int getId_lista() {
		return id;
	}
}
