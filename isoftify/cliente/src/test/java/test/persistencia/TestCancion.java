package test.persistencia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.dominio.Album;
import org.dominio.Cancion;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCancion {

	@Before
	public void TestInicial() {
		ArrayList<Cancion> canciones = Cancion.conseguirTodasCanciones();
		System.out.println("Canciones guardadas:");
		for (Cancion c: canciones) {
			System.out.println(c.toString());
		}
		
		assertEquals(canciones.size(), 3);
	}
	
	@Test
	public void CrearCancion() {
		Album a = new Album("Toxicity", "System of a Down", "44:00", 2001);
		assertEquals(a.guardarAlbum(), 1);
		a = Album.buscarAlbumPorTitulo("Toxicity");
		assertNotNull(a);
		
		Cancion c = new Cancion("Prison Song", "System of a Down", a, 2001, "3:21", (float) 2.5);
		assertEquals(c.guardarCancion(), 1);
		
		c = Cancion.buscarCancionPorTitulo("Prison Song");
		System.out.println("Guardada cancion: " + c.toString());
	}
	
	@After
	public void Limpieza() {
		Cancion c = Cancion.buscarCancionPorTitulo("Prison Song");
		assertEquals(c.borrarCancion(), 1);
		
		c = Cancion.buscarCancionPorTitulo("Prison Song");
		assertNull(c);
		
		Album a = Album.buscarAlbumPorTitulo("Toxicity");
		assertEquals(a.borrarAlbum(), 1);
	}
}
