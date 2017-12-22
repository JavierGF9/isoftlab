package org.persistencia;

import org.dominio.Cancion;
import org.dominio.Producto;

public class GestorProductos {
	private Producto[] productos;
	private GestorCanciones cancs = GestorCanciones.getGestor();
	private Cancion compra = new Cancion();
	
	public void comprarCancion(int id) {
		Cancion[] lista = cancs.conseguirTodasCanciones();
		
		for(int i=0; i < cancs.numCanciones(); i++) {
			for(int j=0; j < cancs.numCanciones(); j++) {
				if(i==lista[j].getId()) {
					compra = lista[j];
				}
			}
			
		}
	}
	

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
}
