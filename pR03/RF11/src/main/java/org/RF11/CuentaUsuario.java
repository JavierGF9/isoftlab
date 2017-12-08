package org.RF11;

public class CuentaUsuario {
	private String nombre;
	private String contraseña;
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
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
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
}
