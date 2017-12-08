package org.RF12;

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
}
