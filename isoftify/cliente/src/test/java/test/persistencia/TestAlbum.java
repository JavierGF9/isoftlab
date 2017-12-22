package test.persistencia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.dominio.Album;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAlbum {

	@Before
	public void TestInicial() {
		ArrayList<Album> albumes = Album.conseguirTodosAlbumes();
		System.out.println("Albumes guardados:");
		for (Album a: albumes) {
			System.out.println(a.toString());
		}
		
		assertEquals(albumes.size(), 2);
	}
	
	@Test
	public void CrearAlbum() {
		Album a = new Album("Led Zeppelin", "Led Zeppelin", "44:00", 1969);
		assertEquals(a.guardarAlbum(), 1);
		
		a = Album.buscarAlbumPorTitulo("Led Zeppelin");
		assertNotNull(a);
		System.out.println("Guardado album: " + a.toString());
	}
	
	@After
	public void Limpieza() {
		Album a = Album.buscarAlbumPorTitulo("Led Zeppelin");
		assertEquals(a.borrarAlbum(), 1);
		
		a = Album.buscarAlbumPorTitulo("Led Zeppelin");
		assertNull(a);
	}
}
