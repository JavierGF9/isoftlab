package test.persistencia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.persistencia.GestorCanciones;
import org.persistencia.GestorListas;
import org.dominio.Cancion;
import org.dominio.Lista;

import java.util.ArrayList;

public class TestAniadirCancionALista {
	
	@Before
	public void TestInicial() {
		GestorCanciones canciones = GestorCanciones.getGestor();
		GestorListas listas = GestorListas.getGestor();
		ArrayList<Cancion> cancs = canciones.conseguirTodasCanciones();
		ArrayList<Lista> list = listas.conseguirTodasListas();
		assertNotNull(cancs);
		assertNotNull(list);
	}

	@Test
	public void testA1() {
		GestorCanciones canciones = GestorCanciones.getGestor();
		GestorListas listas = GestorListas.getGestor();
		ArrayList<Cancion> cancs = canciones.conseguirTodasCanciones();
		ArrayList<Lista> list = listas.conseguirTodasListas();
		int id_cancion = 1;
		String nombre_lista = "Mix2017";
		boolean a�adido=false; //boolean que nos indica si ser�a posible a�adir esa canci�n a la lista
		
		for(int i=0; i<cancs.size(); i++) {
			if(id_cancion == cancs.get(i).getId()) { //comprobamos que exista la canci�n en la base de datos
				for(int j=0; j<list.size(); j++) {
					if(nombre_lista.equals(list.get(j).getNombre_lista())) { //comprobamos que exista la lista en la base de datos
						if(id_cancion == list.get(j).getCancion()) {
							a�adido = false; //La cancion ya est� en la lista
						}
						else {
							a�adido = true; //A�adimos la canci�n
						}
					}
					
				}
			}
		}
		
		assertTrue(a�adido);
		
	}
		
	@Test 
	public void testA2() {
		GestorCanciones canciones = GestorCanciones.getGestor();
		GestorListas listas = GestorListas.getGestor();
		ArrayList<Cancion> cancs = canciones.conseguirTodasCanciones();
		ArrayList<Lista> list = listas.conseguirTodasListas();
		int id_cancion = 98;
		String nombre_lista = "Mix2017";
		boolean a�adido=false; //boolean que nos indica si ser�a posible a�adir esa canci�n a la lista
		
		for(int i=0; i<cancs.size(); i++) {
			if(id_cancion == cancs.get(i).getId()) { //comprobamos que exista la canci�n en la base de datos
				for(int j=0; j<list.size(); j++) {
					if(nombre_lista.equals(list.get(j).getNombre_lista())) { //comprobamos que exista la lista en la base de datos
						if(id_cancion == list.get(j).getCancion()) {
							a�adido = false; //La cancion ya est� en la lista
						}
						else {
							a�adido = true; //A�adimos la canci�n
						}
					}
					
				}
			}
		}
		
		assertFalse(a�adido);
		
	}

	@Test
	public void testA3() {
		GestorCanciones canciones = GestorCanciones.getGestor();
		GestorListas listas = GestorListas.getGestor();
		ArrayList<Cancion> cancs = canciones.conseguirTodasCanciones();
		ArrayList<Lista> list = listas.conseguirTodasListas();
		int id_cancion = 2;
		String nombre_lista = "Mix2017";
		boolean a�adido=false; //boolean que nos indica si ser�a posible a�adir esa canci�n a la lista
		
		for(int i=0; i<cancs.size(); i++) {
			if(id_cancion == cancs.get(i).getId()) { //comprobamos que exista la canci�n en la base de datos
				for(int j=0; j<list.size(); j++) {
					if(nombre_lista.equals(list.get(j).getNombre_lista())) { //comprobamos que exista la lista en la base de datos
						if(id_cancion == list.get(j).getCancion()) {
							a�adido = false; //La cancion ya est� en la lista
						}
						else {
							a�adido = true; //A�adimos la canci�n
						}
					}
					
				}
			}
		}
		
		assertFalse(a�adido);
		
	}
	
	@Test
	public void testB1() {
		GestorCanciones canciones = GestorCanciones.getGestor();
		GestorListas listas = GestorListas.getGestor();
		ArrayList<Cancion> cancs = canciones.conseguirTodasCanciones();
		ArrayList<Lista> list = listas.conseguirTodasListas();
		int id_cancion = 1;
		String nombre_lista = "Mezcla";
		boolean a�adido=false; //boolean que nos indica si ser�a posible a�adir esa canci�n a la lista
		
		for(int i=0; i<cancs.size(); i++) {
			if(id_cancion == cancs.get(i).getId()) { //comprobamos que exista la canci�n en la base de datos
				for(int j=0; j<list.size(); j++) {
					if(nombre_lista.equals(list.get(j).getNombre_lista())) { //comprobamos que exista la lista en la base de datos
						if(id_cancion == list.get(j).getCancion()) {
							a�adido = false; //La cancion ya est� en la lista
						}
						else {
							a�adido = true; //A�adimos la canci�n
						}
					}
					
				}
			}
		}
		
		assertFalse(a�adido);
		
	}
	
	@Test
	public void testB2() {
		GestorCanciones canciones = GestorCanciones.getGestor();
		GestorListas listas = GestorListas.getGestor();
		ArrayList<Cancion> cancs = canciones.conseguirTodasCanciones();
		ArrayList<Lista> list = listas.conseguirTodasListas();
		int id_cancion = 98;
		String nombre_lista = "Mezcla";
		boolean a�adido=false; //boolean que nos indica si ser�a posible a�adir esa canci�n a la lista
		
		for(int i=0; i<cancs.size(); i++) {
			if(id_cancion == cancs.get(i).getId()) { //comprobamos que exista la canci�n en la base de datos
				for(int j=0; j<list.size(); j++) {
					if(nombre_lista.equals(list.get(j).getNombre_lista())) { //comprobamos que exista la lista en la base de datos
						if(id_cancion == list.get(j).getCancion()) {
							a�adido = false; //La cancion ya est� en la lista
						}
						else {
							a�adido = true; //A�adimos la canci�n
						}
					}
					
				}
			}
		}
		
		assertFalse(a�adido);
		
	}
	
	@Test
	public void testB3() {
		GestorCanciones canciones = GestorCanciones.getGestor();
		GestorListas listas = GestorListas.getGestor();
		ArrayList<Cancion> cancs = canciones.conseguirTodasCanciones();
		ArrayList<Lista> list = listas.conseguirTodasListas();
		int id_cancion = 2;
		String nombre_lista = "Mezcla";
		boolean a�adido=false; //boolean que nos indica si ser�a posible a�adir esa canci�n a la lista
		
		for(int i=0; i<cancs.size(); i++) {
			if(id_cancion == cancs.get(i).getId()) { //comprobamos que exista la canci�n en la base de datos
				for(int j=0; j<list.size(); j++) {
					if(nombre_lista.equals(list.get(j).getNombre_lista())) { //comprobamos que exista la lista en la base de datos
						if(id_cancion == list.get(j).getCancion()) {
							a�adido = false; //La cancion ya est� en la lista
						}
						else {
							a�adido = true; //A�adimos la canci�n
						}
					}
					
				}
			}
		}
		
		assertFalse(a�adido);
		
	}
}
