package org.dominio;

public class Lista {
	private Cancion[] canciones;
	private CuentaUsuario cuenta;
	private Album[] albumes;
	private String nombre_lista;
	private String id_lista;
	
	public boolean agregar_cancion(String id) { return true; }
	public boolean agregar_album(String id) { return true; }
	public boolean borrar_cancion(String id) { return true; }
	public boolean borrar_album(String id) { return true; }
	
	public Cancion[] getCanciones() {
		return canciones;
	}
	
	public CuentaUsuario getCuenta() {
		return cuenta;
	}

	public Album[] getAlbumes() {
		return albumes;
	}
	
	public String getNombre_lista() {
		return nombre_lista;
	}
	
	public void setNombre_lista(String nombre_lista) {
		this.nombre_lista = nombre_lista;
	}
	
	public String getId_lista() {
		return id_lista;
	}
}
