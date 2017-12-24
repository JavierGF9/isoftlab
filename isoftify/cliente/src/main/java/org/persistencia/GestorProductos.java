package org.persistencia;

import java.util.ArrayList;

import org.dominio.Cancion;
import org.dominio.Producto;

public class GestorProductos {
	private Producto[] productos;
	private GestorCanciones cancs = GestorCanciones.getGestor();
	private Cancion compra = new Cancion();
	
	public void comprarCancion(int id) {
		ArrayList<Cancion> lista = cancs.conseguirTodasCanciones();
		
		for(int i=0; i < lista.size()-1; i++) {
				if(id==lista.get(i).getId()) {
					compra = lista.get(i);
				}		
		}
		
		if(compra == null) {
			System.out.println("No existe una canción con el ID solicitado");
		}
	}
	
	

	public Producto[] getProductos() {
		return productos.clone();
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos.clone();
	}
}
