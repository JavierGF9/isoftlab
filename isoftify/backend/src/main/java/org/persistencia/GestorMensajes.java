package org.persistencia;

import java.sql.PreparedStatement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;

import org.dominio.CuentaUsuario;
import org.dominio.Mensaje;

public class GestorMensajes {
	
	private static GestorMensajes instancia = null;
	private Agente ag;
	private Mensaje[] mensajes;
	private CuentaUsuario receptor;
	private String contenido;
	
	private GestorMensajes() {
		try {
			ag = Agente.getInstancia();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static GestorMensajes getGestor() {
		if(instancia == null) {
			instancia = new GestorMensajes();
		}
		
		return instancia;
		
	}
	
	public int enviarMensaje(CuentaUsuario receptor, String contenido) {
		int res=0;
		
		try {
			String sql = String.format(Locale.US, "UPDATE USUARIOS SET mensaje = '"+contenido+"' WHERE nombre ='"+receptor+"';");
			PreparedStatement stmt = ag.getStatement(sql);
			res = stmt.executeUpdate();
			stmt.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public String leerMensaje(Mensaje mensaje) {		
		String m = "";
		
		try {
			PreparedStatement stmt = ag.getStatement("SELECT mensaje FROM CANCIONES WHERE nombre = '"+mensaje.getReceptor()+"';");
			ResultSet res = stmt.executeQuery();
			
			m=res.getString(1);

			stmt.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return m;
	}
}
