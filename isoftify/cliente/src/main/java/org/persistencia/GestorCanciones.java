package org.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.dominio.Album;
import org.dominio.Cancion;

public class GestorCanciones {
	private static GestorCanciones instancia = null;
	private Agente ag;
	
	private GestorCanciones() {
		try {
			ag = Agente.getInstancia();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static GestorCanciones getGestor() {
		if (instancia == null) {
			instancia = new GestorCanciones();
		}
		
		return instancia;
	}
	
	public int guardarCancion(Cancion c) {
//		if (GestorAlmacenamiento.getGestor().guardarArchivo(c) == 0)
//			return GestorDatos.getGestor().guardarArchivo(c);
//		
		return 1;
	}
	
	public int actualizarCancion(Cancion c) {
//		return GestorDatos.getGestor().actualizarArchivo(c);
		return 0;
	}
	
	public int numCanciones() {
		int n = 0;
		
		try {
			PreparedStatement stmt = ag.getStatement("SELECT COUNT(ID) FROM CANCIONES;");
			ResultSet res = stmt.executeQuery();
			
			while (res.next()) {
				n = res.getInt(1);
			}

			stmt.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
	}
	
	public Cancion[] conseguirTodasCanciones() {
		ArrayList<Cancion> canciones = new ArrayList<Cancion>();
		
		try {
			PreparedStatement stmt = ag.getStatement("SELECT * FROM CANCIONES;");
			ResultSet res = stmt.executeQuery();
			
			while (res.next()) {
				canciones.add(new Cancion(res.getInt("id"), res.getString("titulo"), res.getString("autor"), res.getInt("album"), res.getInt("anio"), res.getString("duracion"), res.getFloat("precio")));
			}
			
			stmt.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return (Cancion[]) canciones.toArray();
	}
	
	public Cancion[] conseguirCancionesPorAlbum(int album_id) {
		return null;
	}
	
	public Cancion[] buscarCanciones(int modo, String busqueda) {
		/* Modos:
		 * - 1: Album
		 * - 2: artista
		 * - 3: titulo
		 */
		
//		switch (modo) {
//		case 1:
//			return GestorDatos.getGestor().buscarAlbum(busqueda);
//		case 2:
//			return GestorDatos.getGestor().buscarArtista(busqueda);
//		case 3:
//			return GestorDatos.getGestor().buscarTitulo(busqueda);
//		}
		
		return null;
	}
}
