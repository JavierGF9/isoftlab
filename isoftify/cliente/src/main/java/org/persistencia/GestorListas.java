package org.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.dominio.Lista;

public class GestorListas {
	
	private static GestorListas instancia = null;
	private Agente ag;
	
	private GestorListas() {
		try {
			ag = Agente.getInstancia();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static GestorListas getGestor() {
		if (instancia == null) {
			instancia = new GestorListas();
		}
		
		return instancia;
	}
	
	public int borrarLista(int lista_id) {
		int res = 0;
		
		try {
			String sql = String.format("DELETE FROM LISTAS WHERE ID=%d", lista_id);
			PreparedStatement stmt = ag.getStatement(sql);
			res = stmt.executeUpdate();
			stmt.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	public int crearLista(Lista l) {
		int res = 0;
		
		try {
			String sql = String.format("INSERT INTO LISTAS (cuenta, nombre, album, cancion) VALUES ('%s', '%s','%d','%d');", l.getCuenta(), l.getNombre_lista(), l.getAlbum(), l.getCancion());
			PreparedStatement stmt = ag.getStatement(sql);
			res = stmt.executeUpdate();
			stmt.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	public ArrayList<Lista> conseguirTodasListas(){
		ArrayList<Lista> listas = new ArrayList<Lista>();
		
		try {
			PreparedStatement stmt = ag.getStatement("SELECT * FROM listas;");
			ResultSet res = stmt.executeQuery();
			
			while(res.next()) {
				listas.add(new Lista(res.getInt("id"), res.getString("nombre"), res.getInt("cancion")));
			}
			
			stmt.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return listas;
	}
	public Lista conseguirListaPorUsuario(String cuenta) {
		Lista lista = null;
		
		try {
			String sql = String.format("SELECT * FROM LISTAS WHERE CUENTA='%s';",cuenta);
			PreparedStatement stmt = ag.getStatement(sql);
			ResultSet res = stmt.executeQuery();
			
			while (res.next()) {
				lista = new Lista(res.getInt("id"), res.getString("nombre_lista"), res.getString("cuenta"), res.getInt("album"), res.getInt("cancion"));
			}
			
			stmt.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public int actualizarLista (int lista_id, int cancion) {
		int res=0;
		
		try {
			String sql = String.format("UPDATE LISTAS SET CANCION='%d' WHERE ID='%d';", cancion, lista_id);
			PreparedStatement stmt = ag.getStatement(sql);
			res = stmt.executeUpdate();
			stmt.close();		
			}
			catch (Exception e) {
			e.printStackTrace();
			}
		
		return res;
	}
	
}
