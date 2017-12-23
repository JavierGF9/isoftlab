package test.persistencia;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.dominio.Cancion;
import org.junit.Before;
import org.junit.Test;
import org.persistencia.GestorCanciones;

public class TestProducto {

	@Before 
	public void TestInicial() {
		GestorCanciones gestor = GestorCanciones.getGestor();
		Cancion compra = new Cancion();
		ArrayList<Cancion> lista = gestor.conseguirTodasCanciones();
		assertNotNull(lista);
	}

	@Test
	public void testA1() {
		int id = -100;
		GestorCanciones cancs = GestorCanciones.getGestor();
		Cancion compra = null;
		ArrayList<Cancion> lista = cancs.conseguirTodasCanciones();
		for(int i=0; i < lista.size()-1; i++) {
				if(id==lista.get(i).getId()) {
					compra = lista.get(i);
				}		
		}
		assertNull(compra);
	}

	@Test
	public void testA2() {
		int id = 2;
		GestorCanciones cancs = GestorCanciones.getGestor();
		Cancion compra = null;
		ArrayList<Cancion> lista = cancs.conseguirTodasCanciones();
		for(int i=0; i < lista.size()-1; i++) {
				if(id==lista.get(i).getId()) {
					compra = lista.get(i);
				}		
		}
		assertEquals(compra.getId(), 2);
	}
	
	@Test
	public void testA3() {
		int id = 50;
		GestorCanciones cancs = GestorCanciones.getGestor();
		Cancion compra = null;
		ArrayList<Cancion> lista = cancs.conseguirTodasCanciones();
		for(int i=0; i < lista.size()-1; i++) {
				if(id==lista.get(i).getId()) {
					compra = lista.get(i);
				}		
		}
		assertNull(compra);
	}
	
	@Test
	public void testA4() {
		int id = 0;
		GestorCanciones cancs = GestorCanciones.getGestor();
		Cancion compra = null;
		ArrayList<Cancion> lista = cancs.conseguirTodasCanciones();
		for(int i=0; i < lista.size()-1; i++) {
				if(id==lista.get(i).getId()) {
					compra = lista.get(i);
				}		
		}
		assertNull(compra);
	}
	
	@Test
	public void testA5() {
		int id = 3;
		GestorCanciones cancs = GestorCanciones.getGestor();
		Cancion compra = null;
		ArrayList<Cancion> lista = cancs.conseguirTodasCanciones();
		for(int i=0; i < lista.size(); i++) {
				if(id==lista.get(i).getId()) {
					compra = lista.get(i);
				}		
		}
		assertEquals(compra.getId(), 3);
	}
	
	@Test
	public void testB1() {
		int id = -100;
		Cancion compra = null;
		Cancion[] lista = {};
		for(int i=0; i < lista.length-1; i++) {
				if(id==lista[i].getId()) {
					compra = lista[i];
				}		
		}
		assertNull(compra);
	}
	
	@Test
	public void testB2() {
		int id = 2;
		Cancion compra = null;
		Cancion[] lista = {};
		for(int i=0; i < lista.length-1; i++) {
				if(id==lista[i].getId()) {
					compra = lista[i];
				}		
		}
		assertNull(compra);
	}
	
	@Test
	public void testB3() {
		int id = 50;
		Cancion compra = null;
		Cancion[] lista = {};
		for(int i=0; i < lista.length-1; i++) {
				if(id==lista[i].getId()) {
					compra = lista[i];
				}		
		}
		assertNull(compra);
	}
	
	@Test
	public void testB4() {
		int id = 0;
		Cancion compra = null;
		Cancion[] lista = {};
		for(int i=0; i < lista.length-1; i++) {
				if(id==lista[i].getId()) {
					compra = lista[i];
				}		
		}
		assertNull(compra);
	}
	
	@Test
	public void testB5() {
		int id = 3;
		Cancion compra = null;
		Cancion[] lista = {};
		for(int i=0; i < lista.length-1; i++) {
				if(id==lista[i].getId()) {
					compra = lista[i];
				}		
		}
		assertNull(compra);
	}
}
