package org.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.dominio.Album;
import org.dominio.Cancion;

public class GestorAlbumes {
	private static GestorAlbumes instancia = null;
	
	private Agente ag;

	private GestorAlbumes() {
		try {
			ag = Agente.getInstancia();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static GestorAlbumes getGestor() {
		if (instancia == null) {
			instancia = new GestorAlbumes();
		}

		return instancia;
	}

	public int guardarAlbum(Album a) {
		int res = 0;
		
		try {
			String sql = String.format("INSERT INTO ALBUMES (nombre, autor, anio, duracion) VALUES ('%s', '%s', %d, '%s');", a.getNombre_album(), a.getAutor(), a.getAño(), a.getDuracion());
			PreparedStatement stmt = ag.getStatement(sql);
			res = stmt.executeUpdate();
			stmt.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	public Album conseguirAlbumPorTitulo(String titulo) {
		Album album = null;
		
		try {
			String sql = String.format("SELECT * FROM ALBUMES WHERE TITULO='%s';", titulo);
			PreparedStatement stmt = ag.getStatement(sql);
			ResultSet res = stmt.executeQuery();
			
			while (res.next()) {
				album = new Album(res.getInt("id"), res.getString("nombre"), res.getString("autor"), res.getString("duracion"), res.getInt("anio"));
			}
			
			stmt.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return album;
	}
	
	public float conseguirPrecioTotal(int album_id) {
		float precio = 0;
		
		try {
			String sql = String.format("SELECT SUM(precio) FROM CANCIONES WHERE ALBUM_ID=%d;", album_id);
			PreparedStatement stmt = ag.getStatement(sql);
			ResultSet res = stmt.executeQuery();
			
			while (res.next()) {
				precio = res.getFloat(1);
			}
			
			stmt.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return precio;
	}
	
	public ArrayList<Album> conseguirTodosAlbumes() {
		ArrayList<Album> albumes = new ArrayList<Album>();
		
		try {
			PreparedStatement stmt = ag.getStatement("SELECT * FROM ALBUMES;");
			ResultSet res = stmt.executeQuery();
			
			while (res.next()) {
				albumes.add(new Album(res.getInt("id"), res.getString("nombre"), res.getString("autor"), res.getString("duracion"), res.getInt("anio")));
			}
			
			stmt.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return albumes;
	}

	public int actualizarCancion(Album c) {
		return 0;
	}

	public Cancion[] getCanciones(int album_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int borrarAlbum(int album_id) {
		int res = 0;
		
		try {
			String sql = String.format("DELETE FROM ALBUMES WHERE ID=%d", album_id);
			PreparedStatement stmt = ag.getStatement(sql);
			res = stmt.executeUpdate();
			stmt.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}

	public Album conseguirAlbumPorId(int album_id) {
		Album album = null;
		
		try {
			String sql = String.format("SELECT * FROM ALBUMES WHERE ID=%d;", album_id);
			PreparedStatement stmt = ag.getStatement(sql);
			ResultSet res = stmt.executeQuery();
			
			while (res.next()) {
				album = new Album(res.getInt("id"), res.getString("nombre"), res.getString("autor"), res.getString("duracion"), res.getInt("anio"));
			}
			
			stmt.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return album;
	}

	public Album buscarAlbumPorTitulo(String titulo) {
		Album album = null;
		
		try {
			String sql = String.format("SELECT * FROM ALBUMES WHERE NOMBRE='%s';", titulo);
			PreparedStatement stmt = ag.getStatement(sql);
			ResultSet res = stmt.executeQuery();
			
			while (res.next()) {
				album = new Album(res.getInt("id"), res.getString("nombre"), res.getString("autor"), res.getString("duracion"), res.getInt("anio"));
			}
			
			stmt.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return album;
	}
}
