package org.persistencia;

import org.dominio.Producto;

public class GestorProductos {
	private Producto[] productos;
	BDCanciones cancs;
	Cancion compra = new Cancion();
	
	public void comprarCancion(int id) {
		for(int i=0; i < cancs.numCanciones(); i++) {
			for(int j=0; j < cancs.numCanciones(); j++) {
				if(i==cancs.canciones[j].getId()) {
					compra = cancs.canciones[j];
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
