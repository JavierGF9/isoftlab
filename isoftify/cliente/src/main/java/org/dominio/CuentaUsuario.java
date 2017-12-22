package org.dominio;

public class CuentaUsuario {
	private String nombre;
	private String contrasena;
	private Carrito carrito;
	private Lista[] lista;
	private Monedero monedero;
	private Lista[] adquirida;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public Carrito getCarrito() {
		return carrito;
	}
	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}
	public Lista[] getLista() {
		return lista;
	}
	public void setLista(Lista[] lista) {
		this.lista = lista;
	}
	public Monedero getMonedero() {
		return monedero;
	}
	public void setMonedero(Monedero monedero) {
		this.monedero = monedero;
	}
	public Lista[] getAdquirida() {
		return adquirida;
	}
	public void setAdquirida(Lista[] adquirida) {
		this.adquirida = adquirida;
	}
	
	public boolean crear(String usuario, String contrasena) {
		boolean resultado=false;
		
		return resultado;
	}
}
