package org.RF3;

public class Lista {

	private Cancion[] cancion;
	private CuentaUsuario usuario;
	private Album[] album;
	
	private String nombre_lista;
	private String id_lista;
	
	public Lista() {
		
	}
	
	public boolean agregar_cancion(String id_cancion) {
		boolean resultado=false;
		
		return resultado;
	}
	
	public boolean agregar_album(String id_album) {
		boolean resultado=false;
		
		return resultado;
	}
	
	public boolean borrar_cancion(String id_cancion) {
		boolean resultado=false;
		
		return resultado;
	}
	
	public boolean borrar_album(String id_album) {
		boolean resultado=false;
		
		return resultado;
	}

	public Cancion[] getCancion() {
		return cancion;
	}

	public void setCancion(Cancion[] cancion) {
		this.cancion = cancion;
	}

	public CuentaUsuario getUsuario() {
		return usuario;
	}

	public void setUsuario(CuentaUsuario usuario) {
		this.usuario = usuario;
	}

	public Album[] getAlbum() {
		return album;
	}

	public void setAlbum(Album[] album) {
		this.album = album;
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

	public void setId_lista(String id_lista) {
		this.id_lista = id_lista;
	}
	
}
